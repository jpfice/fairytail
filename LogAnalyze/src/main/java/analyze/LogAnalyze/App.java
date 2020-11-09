package analyze.LogAnalyze;

import analyze.Analyze.HayisinFunction;
import analyze.Base.Ifunction;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Ifunction ifun = new HayisinFunction();
        ifun.analyze();
    }
}
