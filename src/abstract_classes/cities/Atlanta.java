package abstract_classes.cities;

public class Atlanta extends City{
	int population;
	double growthRate;
	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		this.population = population;
		this.growthRate = growthRate;
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return population*growthRate*2;
	}
}
