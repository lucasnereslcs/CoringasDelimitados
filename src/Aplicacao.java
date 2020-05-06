import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numeros = Arrays.asList(1, 5, 7, 25, 33);

		List<Object> objetos = new ArrayList<>();

		Copiar(numeros, objetos);
		ImprimeLista(objetos);

	}

	public static void Copiar(List<? extends Number> origem, List<? super Number> destino) {

		for (Number item : origem) {

			destino.add(item);

		}

	}

	public static void ImprimeLista(List<?> lista) {
		for (Object l : lista) {
			System.out.print(l + " ");
		}
	}

}
