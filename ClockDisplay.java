
/**
 * Write a description of class Reloj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private int x;
    //Crear horas
    private int h;
    //Crear minutos
    private int m;
    //Crear segundos
    private int s;

    
    /**
     * Elejir tiempo
     */
    public void SetTime(int hh, int mm, int ss)
    {
        // Damos horas, minutos y segundos
       if (h<24 && m<60 && s<60){
        h=hh;
        m=mm;
        s=ss;
       } 
       else{
           System.out.println("hora no admitida");
        }     
    }
    
    /**
     * uno mas al timepo
     */
    public void timeTick()
    {
        if (m>59){
            h=h+1;
            m=0;
        }
        else if(s<59){
            m=m+1;
            s=0;
        }
    }
    
    /**
     * Mostrar tiempo
     */
    public String getTime()
    {
       String horAc = "%02d:%02d";
       String resultado = String.format(horAc,h,m,s);
       return resultado;
  
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
