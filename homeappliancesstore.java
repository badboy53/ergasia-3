public class homeappliancesstore {
    static String namec ;
    static String adressc ;
    static int ple ;
    public static void main(String[] args) {

        gands pepe = new gands();
        pepe.setNamec(args[3]);
        pepe.setAdressc(args[4]);
        pepe.setPle (Integer.parseInt(args[5]));

        System.out.println("namec = " + pepe.getNamec() + '\n' + "adressc = " + pepe.getAdressc() + '\n' + "ple = " + pepe.getPle());

        namec = args[0];
        adressc = args[1];
        ple = Integer.parseInt(args[2]);

        if(namec == null ) {
            System.out.println("namec error");
        }
        if (adressc == null ) {
            System.out.println("adressc error");
        }

        System.out.println("namec = " + namec + '\n' + "adressc = " + adressc + '\n' + "ple = " + ple);

    }
}