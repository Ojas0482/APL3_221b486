public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Pandav();
        Bharatvanshi bheem = new Pandav();
        Bharatvanshi duryodhan = new Kaurav();
        Bharatvanshi vikarn = new Vikarn();

        System.out.println("Arjun's actions:");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println("\nBheem's actions:");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("\nDuryodhan's actions:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        System.out.println("\nVikarn's actions:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
