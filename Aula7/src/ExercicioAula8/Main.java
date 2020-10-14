package ExercicioAula8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto notebook = new Notebook("Dell", 3500, 1000, "GTX 1050", "Intel core i5");
		Produto camiseta = new Camiseta("Nike", 89.90, "Azul", "M");
		
		System.out.println("-----[Notebook]-----");
		System.out.println(notebook.etiquetaPreco());
		System.out.println("-----[camiseta]-----: ");
		System.out.println(camiseta.etiquetaPreco());
		
		notebook.setPreco(4500);
		
		if(notebook instanceof Notebook) {
			Notebook notebookAux = (Notebook)notebook;
			notebookAux.setProcessador("Intel Core i7");
		}
		
		System.out.println("-----[Notebook]-----");
		System.out.println(notebook.etiquetaPreco());
		System.out.println("-----[camiseta]-----: ");
		System.out.println(camiseta.etiquetaPreco());
	}

}
