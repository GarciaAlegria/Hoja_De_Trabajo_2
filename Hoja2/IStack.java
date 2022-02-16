//Universidad del Valle de Guatemala
//Algoritmos y estructura de datos
//Catedrático Moises Alonso
//Segundo Semestre 2021
//Abner Ivan García Alegría
//Carné 21285
//Sección 20
//Actividad: hoja de trabajo 2
public interface IStack<T> {

	void push(T value);
	
	T pull();
	
	T peek();
	
	int count();
	
	boolean isEmpty();
}
