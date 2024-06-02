package przyklad1;

public class Befor2015EctsCalculationStrategy implements EctsScoreCalculationStrategy{


    @Override
    public boolean canBeApplied(String studia, int year) {
        return year<2015;
    }

    @Override
    public double calculateEctsScore(double[] ects) {
        double score = 0;
        for(double grade : ects){
            score+=grade;
        }
        return score;
    }
}
