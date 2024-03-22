package kolekcja_vector;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Vector wektor = new Vector(); //Tworzenie dynamicznej tablicy Vector

        for (int i = 1; i <= 15; i++)
        {
            wektor.add(i);
            System.out.println("Rzmiar wektora = " + wektor.size() + ", jego pojemność = " + wektor.capacity() + ", jego zawartośc = " + wektor.toString() + ".");
        }
    }
}
