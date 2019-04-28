package ar.edu.unlam.pb2.Disco;

public class Disco {
	
	private Double radioInterior;
	private Double radioExterior;
	
	public Double getRadioInterior() {
		return radioInterior;
	}
	
	public  Double setRadioInterior(Double radioInterior) {
		return this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public Double setRadioExterior(Double radioExterior) {
		return this.radioExterior = radioExterior;
	}
	
	public Disco (Double radioInterior, Double radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
		
	}
	
	public Double perimetroInterior ( Double radioInterior) {
		Double pi=3.14;
		Double perimetro= 2*pi*this.radioInterior;
         return perimetro;
	
	}
	
	public Double perimetroExterior( Double radioExterior) {
		Double pi=3.14;
		Double perimetroExterior=2*pi*this.radioExterior;
		return perimetroExterior;
	}
	
	public Double superficieInterior(Double radioInterior) {
		Double superficieInterior= 3.14*this.radioInterior*this.radioInterior;
		return superficieInterior;
	}
	
	public Double superficieExterior( Double radioExterior) {
		Double superficieExterior= 3.14*this.radioExterior*this.radioExterior;
		return superficieExterior;
	}
	
	public Double superficieTotal(double radioExterior, Double radioInterior) {
		double superficieTotal=this.superficieExterior(radioExterior)+this.superficieInterior(radioInterior);
		return superficieTotal;
	}
	//Metodo para cambia el radio interior
	
	public Double cambiarRadioInterior(Double nuevo)// se puede hacer con setters
	{
	 return this.radioInterior=nuevo;
	
	}
	
	public Double cambiarRadioExterior( Double nuevo) { // se puede hacer con setters
		return this.radioExterior= nuevo;
	}

}
