package przyklad1;

public interface EctsScoreCalculationStrategy {
    boolean canBeApplied(String studia, int year);
    double calculateEctsScore(double[] ects);
}
