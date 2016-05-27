public class Rede {

	public static void main(String[] args) {
		rede();

	}

	public static void rede() {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		Mercado[] mercados = new Mercado[n];
		System.out.println("Quantos mercados deseja registrar: ");
		n = scanner.nextInt();
		for (int i = 0; i < mercados.length; i++) {
			Mercado mercado = new Mercado();
			System.out.println(" Digite o nome: ");
			mercado.nome = scanner.nextLine();
			System.out.println("Informe o produto: ");
			mercado.produtos = scanner.nextInt();
			System.out.println("Informe o valor do produto: ");
			mercado.valordProduto = scanner.nextDouble();

			mercados[i] = mercado;

		}

	}

}
