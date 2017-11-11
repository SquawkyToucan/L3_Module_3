package abstract_classes.cities;

public class SanDiego extends City{
	int population;
	double growthRate;
	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		this.population = population;
		this.growthRate = growthRate;
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return population*growthRate + 1000000;
	}
}
