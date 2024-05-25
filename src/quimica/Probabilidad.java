package quimica;

import java.util.Arrays;

/**
 *
 * @author Manual
 */
public class Probabilidad {
    
    
    private double[] lista;
 
    public Probabilidad(double [] lista){
        this.lista=lista;
         
    }
    
     public double promedio() {
        if (lista == null || lista.length == 0) {
            
            return 0;
        }

        double suma = 0.0;

        
        for (double elemento : lista) {
            suma += elemento;
        }

        double promedio = suma / lista.length;

        return promedio;
    }
    
    public static double calcularDesviacionEstandar(double[] datos) {
        if (datos.length == 0) {
            return 0.0;
        }
        
        
        double media = calcularMedia(datos);
        
        double sumaCuadradosDiferencias = 0.0;
        for (double dato : datos) {
            double diferencia = dato - media;
            sumaCuadradosDiferencias += diferencia * diferencia;
        }
        
       
        double varianza = sumaCuadradosDiferencias / datos.length;
        return Math.sqrt(varianza);
    
    }

    public static double calcularMedia(double[] datos) {
        if (datos.length == 0) {
            return 0.0;
        }
        
        double suma = 0.0;
        for (double dato : datos) {
            suma += dato;
        }
        
        return suma / datos.length;
    }

 
    
    public static double calculatePOH(double pH) {
	        return pH - 14;
	    }

    public static double calculatePH(double concentrationH) {
	        if (concentrationH <= 0) {
	            throw new IllegalArgumentException("La concentración de H+ debe ser mayor que 0.");
	        }
	        return -Math.log10(concentrationH);
	    }

    public static double calculateConcentrationH(double pH) {
	        if (pH < 0 || pH > 14) {
	            throw new IllegalArgumentException("El pH debe estar en el rango de 0 a 14.");
	        }
	        return Math.pow(10, -pH);
	    }

    

    
     public static double calcularMediana(double[] data) {
        Arrays.sort(data);
        int n = data.length;
        if (n % 2 == 0) {
            return (data[n / 2 - 1] + data[n / 2]) / 2.0;
        } else {
            return data[n / 2];
        }    
  }
     
     public static double maxpH(double [] phValues){
            double maximoPH = Arrays.stream(phValues).max().orElse(Double.NaN);
      return maximoPH;      
     }
     
     public static double minpH(double [] phValues){
            double minimoPH = Arrays.stream(phValues).min().orElse(Double.NaN);
     return minimoPH;
     }
     
}


    
