/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import dataBase. conexion;
import java.sql.Connection;
import java.sql.ResultSet;

public class MetodosUsuario {
 private Connection con;
int id=0;
String nombre, correo,usuario, password;
conexion conex=new Conexion ();
Preparedstatement stmt;
ResultSet rs;  

public void insertar (String nombre, String correo, String usuario, String password) (
this.nombre=nombre;
this.correo=correo;
this.usuario=usuario;
this.password=password;
try(
con=conex.getConexion ();
stmt= con.prepareStatement ( sq1: "insert into usuarios (nombre, correo, usuario, contrasenia) values (?,?,?,?)");
stmt. setString ( parameterIndex: 1, x: nombre);
stmt. setString ( parameterIndex: 2, x: correo);
stmt. setString ( parameterIndex: 3, x: usuario);
stmt. setString ( parameterIndex: 4, ×: password);
stmt.executeUpdate ();
JOptionPane. showMessageDialog ( parentComponent: null, message: "Se han insertado los datos");
}catch (SOLException e) {
JOptionPane.showMessageDialog(parentComponent:null,"Errordeconexión:"+e.getMessage());
   }
}

/**s
 *
 * @author rafae
 */
    public int Consultar (String correo) {
this.correo correo;
String clave="";
tryl {
con=conex.getConexion();
stmt= con.prepareStatement (sql:"select id from usuarios where correo=?");
stmt.setString(parameterIndex: 1, x: correo);
rs stmt.executeQuery();

if (rs.next()) {
clave rs.getString(columnLabel: "id");
JOptionPane.showMessageDialog(parent Component: null, "El id es :" +clave);
id=Integer.parseInt(clave);//valor para return

} else {
 JOptionPane.showMessageDialog( parentComponent:null, message: "No existe una persona con ese correo");
 }
}catch (SQLException e) {
    JOptionPane.showMessageDialog(parent Component: null, "Error de conexión:" + e.getMessage());
 }
return id;
 }
 

public void eliminar (int id) {


this.id=id;

try{


con-conex.getConexion();
state con.preparestatement(sql:"Delete from usuarios where id=?");
stat.setInt(parameterIndex: 1, x:id);
stat.executeUpdate();
JOptionPane.showMessageDialog(pareComponentnull, "Usuario eliminado");

}catch (SQLException e) {
    JOptionPane.showMessageDialog(paremcompornull, "Error de conexión:" + e.getMessage());
}
}

public void modificar (int id, String password) {


this.id=id;

try{

}
con-conex.getConexion();
state con.prepareStatement("update usuarios set contrasenias? where id=?");
stat.setString(Id: 1, password);
stat.setInt(parameterIndex: 2, id);
stat.executeUpdate();
JOptionPane.showMessageDialog(parentponent:null, message: "Contraseña cambiada");

}catch (SQLException e) {
    JOptionPane.showMessageDialog( parentComponent:null, "Error de conexión:" + e.getMessage());
 }
}

public void ConsultarUsuario (String usuario, String contrasenia) {
try{

con-conex.getConexion();
stmt.setString(parameterIndex: 1, usuario);
stmt= con.prepareStatement("select usuario, contrasenia from usuarios where usuario-? and contrasenia=?");
atmt.setString( parameterIndex 2, contrasenia):
Is stmt.executeQuery();

if (rs.next()) {
this.usuario rs.getString(columLabel: "usuario");
this.password rs.getString(columniabel "contrasenia");
JOptionPane.showMessageDialog(parentcomponent null, message: "BIENVENIDO AL SISTEMA");

} else {
 JOptionPane.showMessageDialog(parentComponent:null, message: "No existe una persona con ese correo");
}
}catch (SQLException e) {
    JOptionPane.showMessageDialog(parentComponent: null, "Error de conexión:" + e.getMessage());
}
}
}


    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author rafae
 */
public class Loguin {
    
}

//INTERFACE LOGUIN
package Interfaces;

import dataBase.MetodosUsuario;

/**...4 lines */
public class Loguin extends javax.swing.JFrame {
    
/** Creates new form Loguin...3 lines */ 
    String usuario, password;
    
    
    //CREAR CUENTA//
private void jLabel2MouseClicked (java.awt.event.MouseEvent evt) (
//Instancianos la interface y la mostrams RegistrarUsuario Ru new 
        RegistrarUsuario Ru=new RegistrarUsuario();
Ru.setVisible( b:true);
}

//ENTER
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

this. usuario=vUsuario1.getText(); 
this.password=vContrasenial.getText ();

MetodosUsuario mu=new MetodosUsuario();
mu.ConsultarUsuario(usuario, contrasenia=password);
}

    // CAMBIO DE CONTRASEÑA//
private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
//Instancianos la interface y la mostramos
CambiarPassword Cp=new CambiarPassword(); 
Cp.setVisible(b:true);

//Eliminar cuenta
private void jLabelMouseClicked(java.awt.event.MouseEvent evt) {
EliminarUsuario eu=new EliminarUsuario(); 
eu.setVisible(b:true);




   


//INTERFAZ REGISTRAR USUARIO  
package Interfaces; 
import dataBase.*;
/**
 * 
 *@author jdelatru 
 */

public class RegistrarUsuario extends javax.swing.JFrame [

String nombre, correo, usuario,password;

public RegistrarUsuario () (
    initComponents();
}

@SuppressWarnings("unchecked")
Generated Code

private void jButtonlActionPerformed (java.awt.event.ActionEvent evt) {
//Guardamos la información de las cajas de texto en las variables 
this.nombre=vNombre.getText(); 
this.correo=vCorreo.getText(); 
this.usuario=vUsuario.getText();
this.password=vContrasenia.getText();
//Instanciamos la clase MetodosUsuario
MetodosUsuario mu=new MetodosUsuario();
//usamos el método para insertar los datos 
mu.insertar (nombre, correo, usuario, password); 
setVisible(b: false);



//INTERFACE CAMBIAR PASSWORD
package Interfaces;
import dataBase.*;

//@author jdelatru
public class CambiarPassword extends javax.swing.JFrame {
// Creates new form Loggin ...3 lines +

string correo,password;

public CambiarPassword() {
initComponents();

// This method is called from within the constructor to initialize the form...5 lines / @SuppressWarnings("unchecked")
Generated Code
        
private void jButtonlActionPerformed (java.awt.event.ActionEvent evt) {
//Guardamos la información de las cajas de texto en las variables 
this.correo Correo.getText(); 
this.password=vContrasenia.getText();

//Instanciamos la clase MetodosUsuario
MetodosUsuario mu-new MetodosUsuario();
//Consultamos si existe el correo 
int id=mu.Consultar (correo);
//Modificamos el password del correo consultado 
mu.modificar (id, password); 
setVisible(b: false);




//INTERFAZ ELIMINAR CUENTA
package Interfaces;
import dataBase.*;
//4 lines /
public class EliminarUsuario extends javax.swing.JFrame {
    
}
//Creates new form Loggin

String correo;
public EliminarUsuario() { initComponents();
}
//This method is called from within the constructor to initialize the form ...5 lines / 
 @SuppressWarnings("unchecked")
Generated Code
         
private void jButtonlActionPerformed (java.awt.event.ActionEvent evt) {
//Guardamos la información de las cajas de texto en las variables 
this.correo=vCorreo.getText();


//Instanciamos la clase MetodosUsuario 
MetodosUsuario mu=new MetodosUsuario();

//Consultamos si existe el correo 
int id=mu.Consultar (correo);

//Eliminamos el id del correo consultado 
mu.eliminar (id);
setVisible(b: false);