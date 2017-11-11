package abstract_classes.cities;

public class Boston extends City{
	int population;
	double growthRate;
	public Boston(int population, double growthRate) {
		super(population, growthRate);
		this.population = population;
		this.growthRate = growthRate;
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return (population)*growthRate+population*0.50;
	}
}
