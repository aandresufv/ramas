import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class contador {
    //Atributos
    int dias=0;

    //Metodos

    public int cuentadias(int dia, int mes, int anio){
        LocalDate fechaactual = LocalDate.now();
        int dias = 0;
        int diaactual = fechaactual.getDayOfMonth();
        int mesactual = fechaactual.getMonthValue();
        int anioactual = fechaactual.getYear();

        System.out.println("\n El dia actual es " + diaactual + " el mes actual es " + mesactual + " el anio actual es " + anioactual);
        dias = (diaactual+mesactual*30+anioactual*365)-(dia+mes*30+anio*365);
        System.out.println("\nHas vivido "+ dias+ " dias");

        return dias;
    }

}
