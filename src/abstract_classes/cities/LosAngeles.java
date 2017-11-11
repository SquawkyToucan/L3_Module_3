package abstract_classes.cities;

public class LosAngeles extends City{
	int population;
	double growthRate;
	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		this.population = population;
		this.growthRate = growthRate;
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return population*(growthRate*0.5)*growthRate;
	}
}
