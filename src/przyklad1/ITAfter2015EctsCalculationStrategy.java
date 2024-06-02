package przyklad1;

public class ITAfter2015EctsCalculationStrategy implements EctsScoreCalculationStrategy{

    @Override
    public boolean canBeApplied(String studia, int year) {
        return year>2015 && studia.equals("IT");
    }

    @Override
    public double calculateEctsScore(double[] ects) {
        double score = 0;
        for(double grade : ects){
            score+=grade*2;
        }
        return score;
    }
}
