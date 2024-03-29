import java.sql.*;
public class CreateMySQL {
    public static void main(String[] args) {
        String status = "Nada aconteceu ainda.";
        try{
            String strCreateTable = "CREATE TABLE `mysql_connector`.`tbl_create` (`id` INT NOT NULL AUTO_INCREMENT, `nome` VARCHAR(255) NULL, PRIMARY KEY (`id`));";
            Connection conn = App.conectar();
            Statement stmSql = conn.createStatement();  
            stmSql.addBatch(strCreateTable);
            stmSql.executeBatch();
            stmSql.close();    
            status ="Ok! Tabela Criada com sucesso.";
        }catch (Exception e) {
            System.err.println("Ops! ocorreu um erro" + e);
        }
        System.out.println(status);
    }
}