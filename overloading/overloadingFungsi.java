
package overloading;
import java.util.Arrays;

public class overloadingFungsi 
{
    public static void main(String[] args)
    {
        int m1[]={3,7, 2};
        int m2[]={2, 2, 2};
        
        vector3 nilai = new vector3();

        System.out.println("Hasil perkalian vektor dengan skalar : "+nilai.operate(m1, 5));
        System.out.println("Hasil perkalian vektor dengan vektor : "+nilai.operate(m1, m2));
        
    }
}

class vector3 
{
    public int operate (int a[], int skalar)
    {
        int i=0, hasil = 0;
        
        for (i=0; i<=2; i++)
        {
            hasil= hasil+a[i]*skalar;
        }
        return hasil;
    }
    public int operate( int a[], int b[])
    {
        int i = 0, hasil = 0;
        
        for (i=0; i<=2; i++)
        {
            hasil=hasil+a[i]*b[i];
        }
        return hasil;
    }
}