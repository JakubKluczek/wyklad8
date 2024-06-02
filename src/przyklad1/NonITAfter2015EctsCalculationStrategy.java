package przyklad1;

public class NonITAfter2015EctsCalculationStrategy implements EctsScoreCalculationStrategy{
    @Override
    public boolean canBeApplied(String studia, int year) {
        return studia.equals("IT") && year >2015;
    }

    @Override
    public double calculateEctsScore(double[] ects) {
        double score = 0;
        for(double grade : ects){
            score+=grade*3;
        }
        return score;
    }
}
