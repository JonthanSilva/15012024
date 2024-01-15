import java.beans.Statement;
import java.sql.Connection;
import java.util.Scanner;

public class CreateMySQLInteract {
    public static void main(String[] args) {
        
    String status = "Nada Aconteceu.";
    boolean sair = false;
    while (sair == false) {
        try{
        String str1 = "CREATE TABLE `mysql_connector`";
        String str2 = "(`id` INT NOT NULL AUTO_INCREMENT, `";
        String str3 = "` VARCHAR(255) NULL, PRIMARY KEY (`id`));";
        Scanner scnInput = new Scanner(System.in);

        System.out.println("Digite o nome da tabela");
        String strNomeTabela = scnInput.nextLine();
        
        System.out.println("Digite o nome do campo");
        String strNomeCampo = scnInput.nextLine();

        String strCreateTable =  str1 + strNomeTabela + str2 + strNomeCampo + str3;

        Connection conn = App.conectar();
        Statement stmSql = conn.createStatement();  
        stmSql.addBatch(strCreateTable);
        stmSql.executeBatch();
        stmSql.close()    
        status ="Tabela Criada com sucesso.";

        System.out.println("Desejar criar uma outra tabela? Digite [s] para sim ou [n] cancelar e sair");
        String confSair = scan.nextLine()
        stmSql.close();
    }catch (Exception e) {
        System.err.println("Ops! ocorreu um erro" + e);
    }
    }
}
