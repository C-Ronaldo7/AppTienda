package com.upea;
import java.util.*;
public class tienda {
// todo atributo
Scanner lec=new Scanner(System.in);
private String nombre,direccion ;
private int nroProducto;
private String [][] producto = new String [100][2];
//todo costructores
    tienda(){}
    //todo getter y stters

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNroProducto() {
        return this.nroProducto;
    }

    public void setNroProducto(int nroProducto) {
        this.nroProducto = nroProducto;
    }
    //todo leer
    public void leer()
    {
        System.out.print("ingrese Nombre: ");
        setNombre(lec.nextLine());
        System.out.print("ingrese la direccion: ");
        setDireccion(lec.nextLine());
        System.out.print("ingresa el numero del producto: ");
        setNroProducto(lec.nextInt());
        for(int i=0;i<getNroProducto();i++)
        {
            System.out.print("Producto");
            producto[i][0]=lec.nextLine();
            System.out.print("Precio");
            producto[i][1]=lec.nextLine();
        }
    }
    //todo mostrar
    public void mostrar()
    {
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Direccion: "+ getDireccion());
        for(int i=0;i<getNroProducto();i++)
        {
            System.out.println("Nombre: "+ producto[i][0]+"i"+"Precio"+ producto[i][1]);
        }
    }
    //todo adicionar
    public void adicionar(int n)
    {
        int m=getNroProducto();
        setNroProducto(getNroProducto()+n);
        for(int i=m;i<getNroProducto();i++)
        {
            producto[i][0]=lec.nextLine();
            producto[i][1]=lec.nextLine();
        }
    }
    //todo actualizar
    public void actualizar(String n)
    {
        for(int i=0;i<getNroProducto();i++)
        {
            if(producto[i][0].equals (n))
            {
                producto [i][0]=lec.nextLine();
                producto [i][1]=lec.nextLine();
            }
        }
    }
    // todo eliminar
    public void eliminar(String n)
    {

    }
}
