public static void ENTREGUEOMAIORNUMEORESUAPOSICAO (String[] args){
    Scanner leitor = new Scanner(System.in);
    int maior = 0;
    int posMaior = 1;
    int x;
    for (int i = 1; i <= 100; i++) {
        x = leitor.nextInt();
        if (i == 1) {
            maior = x;
            posMaior = 1;
        } else if (x > maior) {
            maior = x;
            posMaior = i;
        }
    }
    System.out.println(maior);
    System.out.println(posMaior);
}

