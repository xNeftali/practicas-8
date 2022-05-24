package clases;

import java.util.ArrayList;

public class FILO {
//FILO (PILA) Primero en entrar ultimo en salir
	
	private ArrayList<Object> filo = new ArrayList();
	
	public void push(Object o) {
		//Agregar valores a la pila
		filo.add(o);//Agrega el valor
	}
	public Object pop() {
		//Muestra el ultimo valor y lo elimina
		if(!(filo.isEmpty())) {
			Object o = filo.get(filo.size()-1);
			filo.remove(filo.size()-1);
			return o;
		}else {
			return null;
		}
	}
	public Object peek() {
		//Muestra el ultimo valor
		if(!(filo.isEmpty())) {
			return filo.get(filo.size()-1);
		}else {
			return null;
		}
	}
	public Boolean empty() {
		//Verificar si la pila esta llena o vacia
		return filo.isEmpty();
	}
}
