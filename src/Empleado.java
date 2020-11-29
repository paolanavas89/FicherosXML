import java.util.Arrays;
import java.util.regex.*;
import java.lang.String;
import java.io.*;

public class Empleado {
	public static int identificador;
	public static String nombre;
	public static String dni;

	Empleado() {
		identificador = 0;
		nombre = "";
		dni = "";
	}

	Empleado(int identificador, String nombre, String dni) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.dni = dni;
	}

	public int getident() {
		return identificador;
	}

	public void setident(int identificador) {
		this.identificador = identificador;
	}

	public String getnom() {
		return nombre;
	}

	public void setnom(String nombre) {
		this.nombre = nombre;
	}

	public String getdni() {
		return dni;
	}

	public void setdni(String dni) {
		this.dni = dni;
	}

}

