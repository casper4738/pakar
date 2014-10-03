/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.sugeno.inferensi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author casper
 */
public class Rule {

    private double[][] listGejala1;
    private double[][] listGejala2;
    private double[][] listGejala3;
    private double[][] listGejala4;
    private double[][] listGejala5;
    
    private boolean [] listGejalaBool1;
    private boolean [] listGejalaBool2;
    private boolean [] listGejalaBool3;
    private boolean [] listGejalaBool4;
    private boolean [] listGejalaBool5;
    
    private ArrayList<Double> rule;
    private ArrayList<Double> valueOutput;

    public Rule() {
        rule = new ArrayList();
        valueOutput = new ArrayList();
        
        listGejala1 = new double[5][3];
        listGejala2 = new double[5][3];
        listGejala3 = new double[5][3];
        listGejala4 = new double[5][3];
        listGejala5 = new double[5][3];
        
        listGejalaBool1 = new boolean[5];
        listGejalaBool2 = new boolean[5];
        listGejalaBool3 = new boolean[4];
        listGejalaBool4 = new boolean[3];
        listGejalaBool5 = new boolean[6];
    }

    public void rule1() {
        rule = new ArrayList();
        valueOutput = new ArrayList();

        /*000*/valueOutput.add(2.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][0], listGejala1[3][0], listGejala1[4][0]));
        /*001*/valueOutput.add(2.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][0], listGejala1[3][0], listGejala1[4][1]));
        /*002*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][0], listGejala1[3][0], listGejala1[4][2]));
        /*003*/valueOutput.add(2.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][0], listGejala1[3][1], listGejala1[4][0]));
        /*004*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][0], listGejala1[3][1], listGejala1[4][1]));
        /*005*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][0], listGejala1[3][1], listGejala1[4][2]));
        /*006*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][0], listGejala1[3][2], listGejala1[4][0]));
        /*007*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][0], listGejala1[3][2], listGejala1[4][1]));
        /*008*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][0], listGejala1[3][2], listGejala1[4][2]));
        /*009*/valueOutput.add(2.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][1], listGejala1[3][0], listGejala1[4][0]));
        /*010*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][1], listGejala1[3][0], listGejala1[4][1]));
        /*011*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][1], listGejala1[3][0], listGejala1[4][2]));
        /*012*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][1], listGejala1[3][1], listGejala1[4][0]));
        /*013*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][1], listGejala1[3][1], listGejala1[4][1]));
        /*014*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][1], listGejala1[3][1], listGejala1[4][2]));
        /*015*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][1], listGejala1[3][2], listGejala1[4][0]));
        /*016*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][1], listGejala1[3][2], listGejala1[4][1]));
        /*017*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][1], listGejala1[3][2], listGejala1[4][2]));
        /*018*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][2], listGejala1[3][0], listGejala1[4][0]));
        /*019*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][2], listGejala1[3][0], listGejala1[4][1]));
        /*020*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][2], listGejala1[3][0], listGejala1[4][2]));
        /*021*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][2], listGejala1[3][1], listGejala1[4][0]));
        /*022*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][2], listGejala1[3][1], listGejala1[4][1]));
        /*023*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][2], listGejala1[3][1], listGejala1[4][2]));
        /*024*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][2], listGejala1[3][2], listGejala1[4][0]));
        /*025*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][2], listGejala1[3][2], listGejala1[4][1]));
        /*026*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][0], listGejala1[2][2], listGejala1[3][2], listGejala1[4][2]));
        /*027*/valueOutput.add(2.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][0], listGejala1[3][0], listGejala1[4][0]));
        /*028*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][0], listGejala1[3][0], listGejala1[4][1]));
        /*029*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][0], listGejala1[3][0], listGejala1[4][2]));
        /*030*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][0], listGejala1[3][1], listGejala1[4][0]));
        /*031*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][0], listGejala1[3][1], listGejala1[4][1]));
        /*032*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][0], listGejala1[3][1], listGejala1[4][2]));
        /*033*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][0], listGejala1[3][2], listGejala1[4][0]));
        /*034*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][0], listGejala1[3][2], listGejala1[4][1]));
        /*035*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][0], listGejala1[3][2], listGejala1[4][2]));
        /*036*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][1], listGejala1[3][0], listGejala1[4][0]));
        /*037*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][1], listGejala1[3][0], listGejala1[4][1]));
        /*038*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][1], listGejala1[3][0], listGejala1[4][2]));
        /*039*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][1], listGejala1[3][1], listGejala1[4][0]));
        /*040*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][1], listGejala1[3][1], listGejala1[4][1]));
        /*041*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][1], listGejala1[3][1], listGejala1[4][2]));
        /*042*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][1], listGejala1[3][2], listGejala1[4][0]));
        /*043*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][1], listGejala1[3][2], listGejala1[4][1]));
        /*044*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][1], listGejala1[3][2], listGejala1[4][2]));
        /*045*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][2], listGejala1[3][0], listGejala1[4][0]));
        /*046*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][2], listGejala1[3][0], listGejala1[4][1]));
        /*047*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][2], listGejala1[3][0], listGejala1[4][2]));
        /*048*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][2], listGejala1[3][1], listGejala1[4][0]));
        /*049*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][2], listGejala1[3][1], listGejala1[4][1]));
        /*050*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][2], listGejala1[3][1], listGejala1[4][2]));
        /*051*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][2], listGejala1[3][2], listGejala1[4][0]));
        /*052*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][2], listGejala1[3][2], listGejala1[4][1]));
        /*053*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][1], listGejala1[2][2], listGejala1[3][2], listGejala1[4][2]));
        /*054*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][0], listGejala1[3][0], listGejala1[4][0]));
        /*055*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][0], listGejala1[3][0], listGejala1[4][1]));
        /*056*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][0], listGejala1[3][0], listGejala1[4][2]));
        /*057*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][0], listGejala1[3][1], listGejala1[4][0]));
        /*058*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][0], listGejala1[3][1], listGejala1[4][1]));
        /*059*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][0], listGejala1[3][1], listGejala1[4][2]));
        /*060*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][0], listGejala1[3][2], listGejala1[4][0]));
        /*061*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][0], listGejala1[3][2], listGejala1[4][1]));
        /*062*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][0], listGejala1[3][2], listGejala1[4][2]));
        /*063*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][1], listGejala1[3][0], listGejala1[4][0]));
        /*064*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][1], listGejala1[3][0], listGejala1[4][1]));
        /*065*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][1], listGejala1[3][0], listGejala1[4][2]));
        /*066*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][1], listGejala1[3][1], listGejala1[4][0]));
        /*067*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][1], listGejala1[3][1], listGejala1[4][1]));
        /*068*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][1], listGejala1[3][1], listGejala1[4][2]));
        /*069*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][1], listGejala1[3][2], listGejala1[4][0]));
        /*070*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][1], listGejala1[3][2], listGejala1[4][1]));
        /*071*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][1], listGejala1[3][2], listGejala1[4][2]));
        /*072*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][2], listGejala1[3][0], listGejala1[4][0]));
        /*073*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][2], listGejala1[3][0], listGejala1[4][1]));
        /*074*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][2], listGejala1[3][0], listGejala1[4][2]));
        /*075*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][2], listGejala1[3][1], listGejala1[4][0]));
        /*076*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][2], listGejala1[3][1], listGejala1[4][1]));
        /*077*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][2], listGejala1[3][1], listGejala1[4][2]));
        /*078*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][2], listGejala1[3][2], listGejala1[4][0]));
        /*079*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][2], listGejala1[3][2], listGejala1[4][1]));
        /*080*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][0], listGejala1[1][2], listGejala1[2][2], listGejala1[3][2], listGejala1[4][2]));
        /*081*/valueOutput.add(2.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][0], listGejala1[3][0], listGejala1[4][0]));
        /*082*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][0], listGejala1[3][0], listGejala1[4][1]));
        /*083*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][0], listGejala1[3][0], listGejala1[4][2]));
        /*084*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][0], listGejala1[3][1], listGejala1[4][0]));
        /*085*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][0], listGejala1[3][1], listGejala1[4][1]));
        /*086*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][0], listGejala1[3][1], listGejala1[4][2]));
        /*087*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][0], listGejala1[3][2], listGejala1[4][0]));
        /*088*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][0], listGejala1[3][2], listGejala1[4][1]));
        /*089*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][0], listGejala1[3][2], listGejala1[4][2]));
        /*090*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][1], listGejala1[3][0], listGejala1[4][0]));
        /*091*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][1], listGejala1[3][0], listGejala1[4][1]));
        /*092*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][1], listGejala1[3][0], listGejala1[4][2]));
        /*093*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][1], listGejala1[3][1], listGejala1[4][0]));
        /*094*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][1], listGejala1[3][1], listGejala1[4][1]));
        /*095*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][1], listGejala1[3][1], listGejala1[4][2]));
        /*096*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][1], listGejala1[3][2], listGejala1[4][0]));
        /*097*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][1], listGejala1[3][2], listGejala1[4][1]));
        /*098*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][1], listGejala1[3][2], listGejala1[4][2]));
        /*099*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][2], listGejala1[3][0], listGejala1[4][0]));
        /*100*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][2], listGejala1[3][0], listGejala1[4][1]));
        /*101*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][2], listGejala1[3][0], listGejala1[4][2]));
        /*102*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][2], listGejala1[3][1], listGejala1[4][0]));
        /*103*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][2], listGejala1[3][1], listGejala1[4][1]));
        /*104*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][2], listGejala1[3][1], listGejala1[4][2]));
        /*105*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][2], listGejala1[3][2], listGejala1[4][0]));
        /*106*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][2], listGejala1[3][2], listGejala1[4][1]));
        /*107*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][0], listGejala1[2][2], listGejala1[3][2], listGejala1[4][2]));
        /*108*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][0], listGejala1[3][0], listGejala1[4][0]));
        /*109*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][0], listGejala1[3][0], listGejala1[4][1]));
        /*110*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][0], listGejala1[3][0], listGejala1[4][2]));
        /*111*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][0], listGejala1[3][1], listGejala1[4][0]));
        /*112*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][0], listGejala1[3][1], listGejala1[4][1]));
        /*113*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][0], listGejala1[3][1], listGejala1[4][2]));
        /*114*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][0], listGejala1[3][2], listGejala1[4][0]));
        /*115*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][0], listGejala1[3][2], listGejala1[4][1]));
        /*116*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][0], listGejala1[3][2], listGejala1[4][2]));
        /*117*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][1], listGejala1[3][0], listGejala1[4][0]));
        /*118*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][1], listGejala1[3][0], listGejala1[4][1]));
        /*119*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][1], listGejala1[3][0], listGejala1[4][2]));
        /*120*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][1], listGejala1[3][1], listGejala1[4][0]));
        /*121*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][1], listGejala1[3][1], listGejala1[4][1]));
        /*122*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][1], listGejala1[3][1], listGejala1[4][2]));
        /*123*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][1], listGejala1[3][2], listGejala1[4][0]));
        /*124*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][1], listGejala1[3][2], listGejala1[4][1]));
        /*125*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][1], listGejala1[3][2], listGejala1[4][2]));
        /*126*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][2], listGejala1[3][0], listGejala1[4][0]));
        /*127*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][2], listGejala1[3][0], listGejala1[4][1]));
        /*128*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][2], listGejala1[3][0], listGejala1[4][2]));
        /*129*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][2], listGejala1[3][1], listGejala1[4][0]));
        /*130*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][2], listGejala1[3][1], listGejala1[4][1]));
        /*131*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][2], listGejala1[3][1], listGejala1[4][2]));
        /*132*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][2], listGejala1[3][2], listGejala1[4][0]));
        /*133*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][2], listGejala1[3][2], listGejala1[4][1]));
        /*134*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][1], listGejala1[2][2], listGejala1[3][2], listGejala1[4][2]));
        /*135*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][0], listGejala1[3][0], listGejala1[4][0]));
        /*136*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][0], listGejala1[3][0], listGejala1[4][1]));
        /*137*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][0], listGejala1[3][0], listGejala1[4][2]));
        /*138*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][0], listGejala1[3][1], listGejala1[4][0]));
        /*139*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][0], listGejala1[3][1], listGejala1[4][1]));
        /*140*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][0], listGejala1[3][1], listGejala1[4][2]));
        /*141*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][0], listGejala1[3][2], listGejala1[4][0]));
        /*142*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][0], listGejala1[3][2], listGejala1[4][1]));
        /*143*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][0], listGejala1[3][2], listGejala1[4][2]));
        /*144*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][1], listGejala1[3][0], listGejala1[4][0]));
        /*145*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][1], listGejala1[3][0], listGejala1[4][1]));
        /*146*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][1], listGejala1[3][0], listGejala1[4][2]));
        /*147*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][1], listGejala1[3][1], listGejala1[4][0]));
        /*148*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][1], listGejala1[3][1], listGejala1[4][1]));
        /*149*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][1], listGejala1[3][1], listGejala1[4][2]));
        /*150*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][1], listGejala1[3][2], listGejala1[4][0]));
        /*151*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][1], listGejala1[3][2], listGejala1[4][1]));
        /*152*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][1], listGejala1[3][2], listGejala1[4][2]));
        /*153*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][2], listGejala1[3][0], listGejala1[4][0]));
        /*154*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][2], listGejala1[3][0], listGejala1[4][1]));
        /*155*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][2], listGejala1[3][0], listGejala1[4][2]));
        /*156*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][2], listGejala1[3][1], listGejala1[4][0]));
        /*157*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][2], listGejala1[3][1], listGejala1[4][1]));
        /*158*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][2], listGejala1[3][1], listGejala1[4][2]));
        /*159*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][2], listGejala1[3][2], listGejala1[4][0]));
        /*160*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][2], listGejala1[3][2], listGejala1[4][1]));
        /*161*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][1], listGejala1[1][2], listGejala1[2][2], listGejala1[3][2], listGejala1[4][2]));
        /*162*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][0], listGejala1[3][0], listGejala1[4][0]));
        /*163*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][0], listGejala1[3][0], listGejala1[4][1]));
        /*164*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][0], listGejala1[3][0], listGejala1[4][2]));
        /*165*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][0], listGejala1[3][1], listGejala1[4][0]));
        /*166*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][0], listGejala1[3][1], listGejala1[4][1]));
        /*167*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][0], listGejala1[3][1], listGejala1[4][2]));
        /*168*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][0], listGejala1[3][2], listGejala1[4][0]));
        /*169*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][0], listGejala1[3][2], listGejala1[4][1]));
        /*170*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][0], listGejala1[3][2], listGejala1[4][2]));
        /*171*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][1], listGejala1[3][0], listGejala1[4][0]));
        /*172*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][1], listGejala1[3][0], listGejala1[4][1]));
        /*173*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][1], listGejala1[3][0], listGejala1[4][2]));
        /*174*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][1], listGejala1[3][1], listGejala1[4][0]));
        /*175*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][1], listGejala1[3][1], listGejala1[4][1]));
        /*176*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][1], listGejala1[3][1], listGejala1[4][2]));
        /*177*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][1], listGejala1[3][2], listGejala1[4][0]));
        /*178*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][1], listGejala1[3][2], listGejala1[4][1]));
        /*179*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][1], listGejala1[3][2], listGejala1[4][2]));
        /*180*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][2], listGejala1[3][0], listGejala1[4][0]));
        /*181*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][2], listGejala1[3][0], listGejala1[4][1]));
        /*182*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][2], listGejala1[3][0], listGejala1[4][2]));
        /*183*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][2], listGejala1[3][1], listGejala1[4][0]));
        /*184*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][2], listGejala1[3][1], listGejala1[4][1]));
        /*185*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][2], listGejala1[3][1], listGejala1[4][2]));
        /*186*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][2], listGejala1[3][2], listGejala1[4][0]));
        /*187*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][2], listGejala1[3][2], listGejala1[4][1]));
        /*188*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][0], listGejala1[2][2], listGejala1[3][2], listGejala1[4][2]));
        /*189*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][0], listGejala1[3][0], listGejala1[4][0]));
        /*190*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][0], listGejala1[3][0], listGejala1[4][1]));
        /*191*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][0], listGejala1[3][0], listGejala1[4][2]));
        /*192*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][0], listGejala1[3][1], listGejala1[4][0]));
        /*193*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][0], listGejala1[3][1], listGejala1[4][1]));
        /*194*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][0], listGejala1[3][1], listGejala1[4][2]));
        /*195*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][0], listGejala1[3][2], listGejala1[4][0]));
        /*196*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][0], listGejala1[3][2], listGejala1[4][1]));
        /*197*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][0], listGejala1[3][2], listGejala1[4][2]));
        /*198*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][1], listGejala1[3][0], listGejala1[4][0]));
        /*199*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][1], listGejala1[3][0], listGejala1[4][1]));
        /*200*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][1], listGejala1[3][0], listGejala1[4][2]));
        /*201*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][1], listGejala1[3][1], listGejala1[4][0]));
        /*202*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][1], listGejala1[3][1], listGejala1[4][1]));
        /*203*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][1], listGejala1[3][1], listGejala1[4][2]));
        /*204*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][1], listGejala1[3][2], listGejala1[4][0]));
        /*205*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][1], listGejala1[3][2], listGejala1[4][1]));
        /*206*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][1], listGejala1[3][2], listGejala1[4][2]));
        /*207*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][2], listGejala1[3][0], listGejala1[4][0]));
        /*208*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][2], listGejala1[3][0], listGejala1[4][1]));
        /*209*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][2], listGejala1[3][0], listGejala1[4][2]));
        /*210*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][2], listGejala1[3][1], listGejala1[4][0]));
        /*211*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][2], listGejala1[3][1], listGejala1[4][1]));
        /*212*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][2], listGejala1[3][1], listGejala1[4][2]));
        /*213*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][2], listGejala1[3][2], listGejala1[4][0]));
        /*214*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][2], listGejala1[3][2], listGejala1[4][1]));
        /*215*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][1], listGejala1[2][2], listGejala1[3][2], listGejala1[4][2]));
        /*216*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][0], listGejala1[3][0], listGejala1[4][0]));
        /*217*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][0], listGejala1[3][0], listGejala1[4][1]));
        /*218*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][0], listGejala1[3][0], listGejala1[4][2]));
        /*219*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][0], listGejala1[3][1], listGejala1[4][0]));
        /*220*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][0], listGejala1[3][1], listGejala1[4][1]));
        /*221*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][0], listGejala1[3][1], listGejala1[4][2]));
        /*222*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][0], listGejala1[3][2], listGejala1[4][0]));
        /*223*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][0], listGejala1[3][2], listGejala1[4][1]));
        /*224*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][0], listGejala1[3][2], listGejala1[4][2]));
        /*225*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][1], listGejala1[3][0], listGejala1[4][0]));
        /*226*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][1], listGejala1[3][0], listGejala1[4][1]));
        /*227*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][1], listGejala1[3][0], listGejala1[4][2]));
        /*228*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][1], listGejala1[3][1], listGejala1[4][0]));
        /*229*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][1], listGejala1[3][1], listGejala1[4][1]));
        /*230*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][1], listGejala1[3][1], listGejala1[4][2]));
        /*231*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][1], listGejala1[3][2], listGejala1[4][0]));
        /*232*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][1], listGejala1[3][2], listGejala1[4][1]));
        /*233*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][1], listGejala1[3][2], listGejala1[4][2]));
        /*234*/valueOutput.add(5.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][2], listGejala1[3][0], listGejala1[4][0]));
        /*235*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][2], listGejala1[3][0], listGejala1[4][1]));
        /*236*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][2], listGejala1[3][0], listGejala1[4][2]));
        /*237*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][2], listGejala1[3][1], listGejala1[4][0]));
        /*238*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][2], listGejala1[3][1], listGejala1[4][1]));
        /*239*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][2], listGejala1[3][1], listGejala1[4][2]));
        /*240*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][2], listGejala1[3][2], listGejala1[4][0]));
        /*241*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][2], listGejala1[3][2], listGejala1[4][1]));
        /*242*/valueOutput.add(8.0); rule.add(minValue1(listGejala1[0][2], listGejala1[1][2], listGejala1[2][2], listGejala1[3][2], listGejala1[4][2]));
    }

    public void rule2() {
        rule = new ArrayList();
        valueOutput = new ArrayList();
        
        /*243*/valueOutput.add(2.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][0], listGejala2[3][0], listGejala2[4][0]));
        /*244*/valueOutput.add(2.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][0], listGejala2[3][0], listGejala2[4][1]));
        /*245*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][0], listGejala2[3][0], listGejala2[4][2]));
        /*246*/valueOutput.add(2.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][0], listGejala2[3][1], listGejala2[4][0]));
        /*247*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][0], listGejala2[3][1], listGejala2[4][1]));
        /*248*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][0], listGejala2[3][1], listGejala2[4][2]));
        /*249*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][0], listGejala2[3][2], listGejala2[4][0]));
        /*250*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][0], listGejala2[3][2], listGejala2[4][1]));
        /*251*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][0], listGejala2[3][2], listGejala2[4][2]));
        /*252*/valueOutput.add(2.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][1], listGejala2[3][0], listGejala2[4][0]));
        /*253*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][1], listGejala2[3][0], listGejala2[4][1]));
        /*254*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][1], listGejala2[3][0], listGejala2[4][2]));
        /*255*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][1], listGejala2[3][1], listGejala2[4][0]));
        /*256*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][1], listGejala2[3][1], listGejala2[4][1]));
        /*257*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][1], listGejala2[3][1], listGejala2[4][2]));
        /*258*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][1], listGejala2[3][2], listGejala2[4][0]));
        /*259*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][1], listGejala2[3][2], listGejala2[4][1]));
        /*260*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][1], listGejala2[3][2], listGejala2[4][2]));
        /*261*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][2], listGejala2[3][0], listGejala2[4][0]));
        /*262*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][2], listGejala2[3][0], listGejala2[4][1]));
        /*263*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][2], listGejala2[3][0], listGejala2[4][2]));
        /*264*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][2], listGejala2[3][1], listGejala2[4][0]));
        /*265*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][2], listGejala2[3][1], listGejala2[4][1]));
        /*266*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][2], listGejala2[3][1], listGejala2[4][2]));
        /*267*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][2], listGejala2[3][2], listGejala2[4][0]));
        /*268*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][2], listGejala2[3][2], listGejala2[4][1]));
        /*269*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][0], listGejala2[2][2], listGejala2[3][2], listGejala2[4][2]));
        /*270*/valueOutput.add(2.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][0], listGejala2[3][0], listGejala2[4][0]));
        /*271*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][0], listGejala2[3][0], listGejala2[4][1]));
        /*272*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][0], listGejala2[3][0], listGejala2[4][2]));
        /*273*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][0], listGejala2[3][1], listGejala2[4][0]));
        /*274*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][0], listGejala2[3][1], listGejala2[4][1]));
        /*275*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][0], listGejala2[3][1], listGejala2[4][2]));
        /*276*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][0], listGejala2[3][2], listGejala2[4][0]));
        /*277*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][0], listGejala2[3][2], listGejala2[4][1]));
        /*278*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][0], listGejala2[3][2], listGejala2[4][2]));
        /*279*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][1], listGejala2[3][0], listGejala2[4][0]));
        /*280*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][1], listGejala2[3][0], listGejala2[4][1]));
        /*281*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][1], listGejala2[3][0], listGejala2[4][2]));
        /*282*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][1], listGejala2[3][1], listGejala2[4][0]));
        /*283*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][1], listGejala2[3][1], listGejala2[4][1]));
        /*284*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][1], listGejala2[3][1], listGejala2[4][2]));
        /*285*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][1], listGejala2[3][2], listGejala2[4][0]));
        /*286*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][1], listGejala2[3][2], listGejala2[4][1]));
        /*287*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][1], listGejala2[3][2], listGejala2[4][2]));
        /*288*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][2], listGejala2[3][0], listGejala2[4][0]));
        /*289*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][2], listGejala2[3][0], listGejala2[4][1]));
        /*290*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][2], listGejala2[3][0], listGejala2[4][2]));
        /*291*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][2], listGejala2[3][1], listGejala2[4][0]));
        /*292*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][2], listGejala2[3][1], listGejala2[4][1]));
        /*293*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][2], listGejala2[3][1], listGejala2[4][2]));
        /*294*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][2], listGejala2[3][2], listGejala2[4][0]));
        /*295*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][2], listGejala2[3][2], listGejala2[4][1]));
        /*296*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][1], listGejala2[2][2], listGejala2[3][2], listGejala2[4][2]));
        /*297*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][0], listGejala2[3][0], listGejala2[4][0]));
        /*298*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][0], listGejala2[3][0], listGejala2[4][1]));
        /*299*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][0], listGejala2[3][0], listGejala2[4][2]));
        /*300*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][0], listGejala2[3][1], listGejala2[4][0]));
        /*301*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][0], listGejala2[3][1], listGejala2[4][1]));
        /*302*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][0], listGejala2[3][1], listGejala2[4][2]));
        /*303*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][0], listGejala2[3][2], listGejala2[4][0]));
        /*304*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][0], listGejala2[3][2], listGejala2[4][1]));
        /*305*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][0], listGejala2[3][2], listGejala2[4][2]));
        /*306*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][1], listGejala2[3][0], listGejala2[4][0]));
        /*307*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][1], listGejala2[3][0], listGejala2[4][1]));
        /*308*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][1], listGejala2[3][0], listGejala2[4][2]));
        /*309*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][1], listGejala2[3][1], listGejala2[4][0]));
        /*310*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][1], listGejala2[3][1], listGejala2[4][1]));
        /*311*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][1], listGejala2[3][1], listGejala2[4][2]));
        /*312*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][1], listGejala2[3][2], listGejala2[4][0]));
        /*313*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][1], listGejala2[3][2], listGejala2[4][1]));
        /*314*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][1], listGejala2[3][2], listGejala2[4][2]));
        /*315*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][2], listGejala2[3][0], listGejala2[4][0]));
        /*316*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][2], listGejala2[3][0], listGejala2[4][1]));
        /*317*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][2], listGejala2[3][0], listGejala2[4][2]));
        /*318*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][2], listGejala2[3][1], listGejala2[4][0]));
        /*319*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][2], listGejala2[3][1], listGejala2[4][1]));
        /*320*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][2], listGejala2[3][1], listGejala2[4][2]));
        /*321*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][2], listGejala2[3][2], listGejala2[4][0]));
        /*322*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][2], listGejala2[3][2], listGejala2[4][1]));
        /*323*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][0], listGejala2[1][2], listGejala2[2][2], listGejala2[3][2], listGejala2[4][2]));
        /*324*/valueOutput.add(2.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][0], listGejala2[3][0], listGejala2[4][0]));
        /*325*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][0], listGejala2[3][0], listGejala2[4][1]));
        /*326*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][0], listGejala2[3][0], listGejala2[4][2]));
        /*327*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][0], listGejala2[3][1], listGejala2[4][0]));
        /*328*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][0], listGejala2[3][1], listGejala2[4][1]));
        /*329*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][0], listGejala2[3][1], listGejala2[4][2]));
        /*330*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][0], listGejala2[3][2], listGejala2[4][0]));
        /*331*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][0], listGejala2[3][2], listGejala2[4][1]));
        /*332*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][0], listGejala2[3][2], listGejala2[4][2]));
        /*333*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][1], listGejala2[3][0], listGejala2[4][0]));
        /*334*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][1], listGejala2[3][0], listGejala2[4][1]));
        /*335*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][1], listGejala2[3][0], listGejala2[4][2]));
        /*336*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][1], listGejala2[3][1], listGejala2[4][0]));
        /*337*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][1], listGejala2[3][1], listGejala2[4][1]));
        /*338*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][1], listGejala2[3][1], listGejala2[4][2]));
        /*339*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][1], listGejala2[3][2], listGejala2[4][0]));
        /*340*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][1], listGejala2[3][2], listGejala2[4][1]));
        /*341*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][1], listGejala2[3][2], listGejala2[4][2]));
        /*342*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][2], listGejala2[3][0], listGejala2[4][0]));
        /*343*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][2], listGejala2[3][0], listGejala2[4][1]));
        /*344*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][2], listGejala2[3][0], listGejala2[4][2]));
        /*345*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][2], listGejala2[3][1], listGejala2[4][0]));
        /*346*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][2], listGejala2[3][1], listGejala2[4][1]));
        /*347*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][2], listGejala2[3][1], listGejala2[4][2]));
        /*348*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][2], listGejala2[3][2], listGejala2[4][0]));
        /*349*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][2], listGejala2[3][2], listGejala2[4][1]));
        /*350*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][0], listGejala2[2][2], listGejala2[3][2], listGejala2[4][2]));
        /*351*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][0], listGejala2[3][0], listGejala2[4][0]));
        /*352*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][0], listGejala2[3][0], listGejala2[4][1]));
        /*353*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][0], listGejala2[3][0], listGejala2[4][2]));
        /*354*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][0], listGejala2[3][1], listGejala2[4][0]));
        /*355*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][0], listGejala2[3][1], listGejala2[4][1]));
        /*356*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][0], listGejala2[3][1], listGejala2[4][2]));
        /*357*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][0], listGejala2[3][2], listGejala2[4][0]));
        /*358*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][0], listGejala2[3][2], listGejala2[4][1]));
        /*359*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][0], listGejala2[3][2], listGejala2[4][2]));
        /*360*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][1], listGejala2[3][0], listGejala2[4][0]));
        /*361*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][1], listGejala2[3][0], listGejala2[4][1]));
        /*362*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][1], listGejala2[3][0], listGejala2[4][2]));
        /*363*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][1], listGejala2[3][1], listGejala2[4][0]));
        /*364*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][1], listGejala2[3][1], listGejala2[4][1]));
        /*365*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][1], listGejala2[3][1], listGejala2[4][2]));
        /*366*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][1], listGejala2[3][2], listGejala2[4][0]));
        /*367*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][1], listGejala2[3][2], listGejala2[4][1]));
        /*368*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][1], listGejala2[3][2], listGejala2[4][2]));
        /*369*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][2], listGejala2[3][0], listGejala2[4][0]));
        /*370*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][2], listGejala2[3][0], listGejala2[4][1]));
        /*371*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][2], listGejala2[3][0], listGejala2[4][2]));
        /*372*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][2], listGejala2[3][1], listGejala2[4][0]));
        /*373*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][2], listGejala2[3][1], listGejala2[4][1]));
        /*374*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][2], listGejala2[3][1], listGejala2[4][2]));
        /*375*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][2], listGejala2[3][2], listGejala2[4][0]));
        /*376*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][2], listGejala2[3][2], listGejala2[4][1]));
        /*377*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][1], listGejala2[2][2], listGejala2[3][2], listGejala2[4][2]));
        /*378*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][0], listGejala2[3][0], listGejala2[4][0]));
        /*379*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][0], listGejala2[3][0], listGejala2[4][1]));
        /*380*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][0], listGejala2[3][0], listGejala2[4][2]));
        /*381*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][0], listGejala2[3][1], listGejala2[4][0]));
        /*382*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][0], listGejala2[3][1], listGejala2[4][1]));
        /*383*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][0], listGejala2[3][1], listGejala2[4][2]));
        /*384*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][0], listGejala2[3][2], listGejala2[4][0]));
        /*385*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][0], listGejala2[3][2], listGejala2[4][1]));
        /*386*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][0], listGejala2[3][2], listGejala2[4][2]));
        /*387*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][1], listGejala2[3][0], listGejala2[4][0]));
        /*388*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][1], listGejala2[3][0], listGejala2[4][1]));
        /*389*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][1], listGejala2[3][0], listGejala2[4][2]));
        /*390*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][1], listGejala2[3][1], listGejala2[4][0]));
        /*391*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][1], listGejala2[3][1], listGejala2[4][1]));
        /*392*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][1], listGejala2[3][1], listGejala2[4][2]));
        /*393*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][1], listGejala2[3][2], listGejala2[4][0]));
        /*394*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][1], listGejala2[3][2], listGejala2[4][1]));
        /*395*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][1], listGejala2[3][2], listGejala2[4][2]));
        /*396*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][2], listGejala2[3][0], listGejala2[4][0]));
        /*397*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][2], listGejala2[3][0], listGejala2[4][1]));
        /*398*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][2], listGejala2[3][0], listGejala2[4][2]));
        /*399*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][2], listGejala2[3][1], listGejala2[4][0]));
        /*400*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][2], listGejala2[3][1], listGejala2[4][1]));
        /*401*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][2], listGejala2[3][1], listGejala2[4][2]));
        /*402*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][2], listGejala2[3][2], listGejala2[4][0]));
        /*403*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][2], listGejala2[3][2], listGejala2[4][1]));
        /*404*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][1], listGejala2[1][2], listGejala2[2][2], listGejala2[3][2], listGejala2[4][2]));
        /*405*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][0], listGejala2[3][0], listGejala2[4][0]));
        /*406*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][0], listGejala2[3][0], listGejala2[4][1]));
        /*407*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][0], listGejala2[3][0], listGejala2[4][2]));
        /*408*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][0], listGejala2[3][1], listGejala2[4][0]));
        /*409*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][0], listGejala2[3][1], listGejala2[4][1]));
        /*410*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][0], listGejala2[3][1], listGejala2[4][2]));
        /*411*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][0], listGejala2[3][2], listGejala2[4][0]));
        /*412*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][0], listGejala2[3][2], listGejala2[4][1]));
        /*413*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][0], listGejala2[3][2], listGejala2[4][2]));
        /*414*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][1], listGejala2[3][0], listGejala2[4][0]));
        /*415*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][1], listGejala2[3][0], listGejala2[4][1]));
        /*416*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][1], listGejala2[3][0], listGejala2[4][2]));
        /*417*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][1], listGejala2[3][1], listGejala2[4][0]));
        /*418*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][1], listGejala2[3][1], listGejala2[4][1]));
        /*419*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][1], listGejala2[3][1], listGejala2[4][2]));
        /*420*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][1], listGejala2[3][2], listGejala2[4][0]));
        /*421*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][1], listGejala2[3][2], listGejala2[4][1]));
        /*422*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][1], listGejala2[3][2], listGejala2[4][2]));
        /*423*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][2], listGejala2[3][0], listGejala2[4][0]));
        /*424*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][2], listGejala2[3][0], listGejala2[4][1]));
        /*425*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][2], listGejala2[3][0], listGejala2[4][2]));
        /*426*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][2], listGejala2[3][1], listGejala2[4][0]));
        /*427*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][2], listGejala2[3][1], listGejala2[4][1]));
        /*428*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][2], listGejala2[3][1], listGejala2[4][2]));
        /*429*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][2], listGejala2[3][2], listGejala2[4][0]));
        /*430*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][2], listGejala2[3][2], listGejala2[4][1]));
        /*431*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][0], listGejala2[2][2], listGejala2[3][2], listGejala2[4][2]));
        /*432*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][0], listGejala2[3][0], listGejala2[4][0]));
        /*433*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][0], listGejala2[3][0], listGejala2[4][1]));
        /*434*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][0], listGejala2[3][0], listGejala2[4][2]));
        /*435*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][0], listGejala2[3][1], listGejala2[4][0]));
        /*436*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][0], listGejala2[3][1], listGejala2[4][1]));
        /*437*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][0], listGejala2[3][1], listGejala2[4][2]));
        /*438*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][0], listGejala2[3][2], listGejala2[4][0]));
        /*439*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][0], listGejala2[3][2], listGejala2[4][1]));
        /*440*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][0], listGejala2[3][2], listGejala2[4][2]));
        /*441*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][1], listGejala2[3][0], listGejala2[4][0]));
        /*442*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][1], listGejala2[3][0], listGejala2[4][1]));
        /*443*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][1], listGejala2[3][0], listGejala2[4][2]));
        /*444*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][1], listGejala2[3][1], listGejala2[4][0]));
        /*445*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][1], listGejala2[3][1], listGejala2[4][1]));
        /*446*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][1], listGejala2[3][1], listGejala2[4][2]));
        /*447*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][1], listGejala2[3][2], listGejala2[4][0]));
        /*448*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][1], listGejala2[3][2], listGejala2[4][1]));
        /*449*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][1], listGejala2[3][2], listGejala2[4][2]));
        /*450*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][2], listGejala2[3][0], listGejala2[4][0]));
        /*451*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][2], listGejala2[3][0], listGejala2[4][1]));
        /*452*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][2], listGejala2[3][0], listGejala2[4][2]));
        /*453*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][2], listGejala2[3][1], listGejala2[4][0]));
        /*454*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][2], listGejala2[3][1], listGejala2[4][1]));
        /*455*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][2], listGejala2[3][1], listGejala2[4][2]));
        /*456*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][2], listGejala2[3][2], listGejala2[4][0]));
        /*457*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][2], listGejala2[3][2], listGejala2[4][1]));
        /*458*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][1], listGejala2[2][2], listGejala2[3][2], listGejala2[4][2]));
        /*459*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][0], listGejala2[3][0], listGejala2[4][0]));
        /*460*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][0], listGejala2[3][0], listGejala2[4][1]));
        /*461*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][0], listGejala2[3][0], listGejala2[4][2]));
        /*462*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][0], listGejala2[3][1], listGejala2[4][0]));
        /*463*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][0], listGejala2[3][1], listGejala2[4][1]));
        /*464*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][0], listGejala2[3][1], listGejala2[4][2]));
        /*465*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][0], listGejala2[3][2], listGejala2[4][0]));
        /*466*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][0], listGejala2[3][2], listGejala2[4][1]));
        /*467*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][0], listGejala2[3][2], listGejala2[4][2]));
        /*468*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][1], listGejala2[3][0], listGejala2[4][0]));
        /*469*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][1], listGejala2[3][0], listGejala2[4][1]));
        /*470*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][1], listGejala2[3][0], listGejala2[4][2]));
        /*471*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][1], listGejala2[3][1], listGejala2[4][0]));
        /*472*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][1], listGejala2[3][1], listGejala2[4][1]));
        /*473*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][1], listGejala2[3][1], listGejala2[4][2]));
        /*474*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][1], listGejala2[3][2], listGejala2[4][0]));
        /*475*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][1], listGejala2[3][2], listGejala2[4][1]));
        /*476*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][1], listGejala2[3][2], listGejala2[4][2]));
        /*477*/valueOutput.add(5.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][2], listGejala2[3][0], listGejala2[4][0]));
        /*478*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][2], listGejala2[3][0], listGejala2[4][1]));
        /*479*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][2], listGejala2[3][0], listGejala2[4][2]));
        /*480*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][2], listGejala2[3][1], listGejala2[4][0]));
        /*481*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][2], listGejala2[3][1], listGejala2[4][1]));
        /*482*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][2], listGejala2[3][1], listGejala2[4][2]));
        /*483*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][2], listGejala2[3][2], listGejala2[4][0]));
        /*484*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][2], listGejala2[3][2], listGejala2[4][1]));
        /*485*/valueOutput.add(8.0); rule.add(minValue2(listGejala2[0][2], listGejala2[1][2], listGejala2[2][2], listGejala2[3][2], listGejala2[4][2]));
    }

    public void rule3() {
        rule = new ArrayList();
        valueOutput = new ArrayList();

        /*486*/valueOutput.add(2.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][0], listGejala3[2][0], listGejala3[3][0]));
        /*487*/valueOutput.add(2.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][0], listGejala3[2][0], listGejala3[3][1]));
        /*488*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][0], listGejala3[2][0], listGejala3[3][2]));
        /*489*/valueOutput.add(2.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][0], listGejala3[2][1], listGejala3[3][0]));
        /*490*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][0], listGejala3[2][1], listGejala3[3][1]));
        /*491*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][0], listGejala3[2][1], listGejala3[3][2]));
        /*492*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][0], listGejala3[2][2], listGejala3[3][0]));
        /*493*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][0], listGejala3[2][2], listGejala3[3][1]));
        /*494*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][0], listGejala3[2][2], listGejala3[3][2]));
        /*495*/valueOutput.add(2.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][1], listGejala3[2][0], listGejala3[3][0]));
        /*496*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][1], listGejala3[2][0], listGejala3[3][1]));
        /*497*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][1], listGejala3[2][0], listGejala3[3][2]));
        /*498*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][1], listGejala3[2][1], listGejala3[3][0]));
        /*499*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][1], listGejala3[2][1], listGejala3[3][1]));
        /*500*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][1], listGejala3[2][1], listGejala3[3][2]));
        /*501*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][1], listGejala3[2][2], listGejala3[3][0]));
        /*502*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][1], listGejala3[2][2], listGejala3[3][1]));
        /*503*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][1], listGejala3[2][2], listGejala3[3][2]));
        /*504*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][2], listGejala3[2][0], listGejala3[3][0]));
        /*505*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][2], listGejala3[2][0], listGejala3[3][1]));
        /*506*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][2], listGejala3[2][0], listGejala3[3][2]));
        /*507*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][2], listGejala3[2][1], listGejala3[3][0]));
        /*508*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][2], listGejala3[2][1], listGejala3[3][1]));
        /*509*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][2], listGejala3[2][1], listGejala3[3][2]));
        /*510*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][2], listGejala3[2][2], listGejala3[3][0]));
        /*511*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][2], listGejala3[2][2], listGejala3[3][1]));
        /*512*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][0], listGejala3[1][2], listGejala3[2][2], listGejala3[3][2]));
        /*513*/valueOutput.add(2.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][0], listGejala3[2][0], listGejala3[3][0]));
        /*514*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][0], listGejala3[2][0], listGejala3[3][1]));
        /*515*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][0], listGejala3[2][0], listGejala3[3][2]));
        /*516*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][0], listGejala3[2][1], listGejala3[3][0]));
        /*517*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][0], listGejala3[2][1], listGejala3[3][1]));
        /*518*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][0], listGejala3[2][1], listGejala3[3][2]));
        /*519*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][0], listGejala3[2][2], listGejala3[3][0]));
        /*520*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][0], listGejala3[2][2], listGejala3[3][1]));
        /*521*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][0], listGejala3[2][2], listGejala3[3][2]));
        /*522*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][1], listGejala3[2][0], listGejala3[3][0]));
        /*523*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][1], listGejala3[2][0], listGejala3[3][1]));
        /*524*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][1], listGejala3[2][0], listGejala3[3][2]));
        /*525*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][1], listGejala3[2][1], listGejala3[3][0]));
        /*526*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][1], listGejala3[2][1], listGejala3[3][1]));
        /*527*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][1], listGejala3[2][1], listGejala3[3][2]));
        /*528*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][1], listGejala3[2][2], listGejala3[3][0]));
        /*529*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][1], listGejala3[2][2], listGejala3[3][1]));
        /*530*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][1], listGejala3[2][2], listGejala3[3][2]));
        /*531*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][2], listGejala3[2][0], listGejala3[3][0]));
        /*532*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][2], listGejala3[2][0], listGejala3[3][1]));
        /*533*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][2], listGejala3[2][0], listGejala3[3][2]));
        /*534*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][2], listGejala3[2][1], listGejala3[3][0]));
        /*535*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][2], listGejala3[2][1], listGejala3[3][1]));
        /*536*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][2], listGejala3[2][1], listGejala3[3][2]));
        /*537*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][2], listGejala3[2][2], listGejala3[3][0]));
        /*538*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][2], listGejala3[2][2], listGejala3[3][1]));
        /*539*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][1], listGejala3[1][2], listGejala3[2][2], listGejala3[3][2]));
        /*540*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][0], listGejala3[2][0], listGejala3[3][0]));
        /*541*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][0], listGejala3[2][0], listGejala3[3][1]));
        /*542*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][0], listGejala3[2][0], listGejala3[3][2]));
        /*543*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][0], listGejala3[2][1], listGejala3[3][0]));
        /*544*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][0], listGejala3[2][1], listGejala3[3][1]));
        /*545*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][0], listGejala3[2][1], listGejala3[3][2]));
        /*546*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][0], listGejala3[2][2], listGejala3[3][0]));
        /*547*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][0], listGejala3[2][2], listGejala3[3][1]));
        /*548*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][0], listGejala3[2][2], listGejala3[3][2]));
        /*549*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][1], listGejala3[2][0], listGejala3[3][0]));
        /*550*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][1], listGejala3[2][0], listGejala3[3][1]));
        /*551*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][1], listGejala3[2][0], listGejala3[3][2]));
        /*552*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][1], listGejala3[2][1], listGejala3[3][0]));
        /*553*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][1], listGejala3[2][1], listGejala3[3][1]));
        /*554*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][1], listGejala3[2][1], listGejala3[3][2]));
        /*555*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][1], listGejala3[2][2], listGejala3[3][0]));
        /*556*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][1], listGejala3[2][2], listGejala3[3][1]));
        /*557*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][1], listGejala3[2][2], listGejala3[3][2]));
        /*558*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][2], listGejala3[2][0], listGejala3[3][0]));
        /*559*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][2], listGejala3[2][0], listGejala3[3][1]));
        /*560*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][2], listGejala3[2][0], listGejala3[3][2]));
        /*561*/valueOutput.add(5.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][2], listGejala3[2][1], listGejala3[3][0]));
        /*562*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][2], listGejala3[2][1], listGejala3[3][1]));
        /*563*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][2], listGejala3[2][1], listGejala3[3][2]));
        /*564*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][2], listGejala3[2][2], listGejala3[3][0]));
        /*565*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][2], listGejala3[2][2], listGejala3[3][1]));
        /*566*/valueOutput.add(8.0); rule.add(minValue3(listGejala3[0][2], listGejala3[1][2], listGejala3[2][2], listGejala3[3][2]));
    }
    
    public void rule4() {
        rule = new ArrayList();
        valueOutput = new ArrayList();
        
        /*567*/valueOutput.add(2.0); rule.add(minValue4(listGejala4[0][0], listGejala4[1][0], listGejala4[2][0]));
        /*568*/valueOutput.add(2.0); rule.add(minValue4(listGejala4[0][0], listGejala4[1][0], listGejala4[2][1]));
        /*569*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][0], listGejala4[1][0], listGejala4[2][2]));
        /*570*/valueOutput.add(2.0); rule.add(minValue4(listGejala4[0][0], listGejala4[1][1], listGejala4[2][0]));
        /*571*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][0], listGejala4[1][1], listGejala4[2][1]));
        /*572*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][0], listGejala4[1][1], listGejala4[2][2]));
        /*573*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][0], listGejala4[1][2], listGejala4[2][0]));
        /*574*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][0], listGejala4[1][2], listGejala4[2][1]));
        /*575*/valueOutput.add(8.0); rule.add(minValue4(listGejala4[0][0], listGejala4[1][2], listGejala4[2][2]));
        /*576*/valueOutput.add(2.0); rule.add(minValue4(listGejala4[0][1], listGejala4[1][0], listGejala4[2][0]));
        /*577*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][1], listGejala4[1][0], listGejala4[2][1]));
        /*578*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][1], listGejala4[1][0], listGejala4[2][2]));
        /*579*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][1], listGejala4[1][1], listGejala4[2][0]));
        /*580*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][1], listGejala4[1][1], listGejala4[2][1]));
        /*581*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][1], listGejala4[1][1], listGejala4[2][2]));
        /*582*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][1], listGejala4[1][2], listGejala4[2][0]));
        /*583*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][1], listGejala4[1][2], listGejala4[2][1]));
        /*584*/valueOutput.add(8.0); rule.add(minValue4(listGejala4[0][1], listGejala4[1][2], listGejala4[2][2]));
        /*585*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][2], listGejala4[1][0], listGejala4[2][0]));
        /*586*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][2], listGejala4[1][0], listGejala4[2][1]));
        /*587*/valueOutput.add(8.0); rule.add(minValue4(listGejala4[0][2], listGejala4[1][0], listGejala4[2][2]));
        /*588*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][2], listGejala4[1][1], listGejala4[2][0]));
        /*589*/valueOutput.add(5.0); rule.add(minValue4(listGejala4[0][2], listGejala4[1][1], listGejala4[2][1]));
        /*590*/valueOutput.add(8.0); rule.add(minValue4(listGejala4[0][2], listGejala4[1][1], listGejala4[2][2]));
        /*591*/valueOutput.add(8.0); rule.add(minValue4(listGejala4[0][2], listGejala4[1][2], listGejala4[2][0]));
        /*592*/valueOutput.add(8.0); rule.add(minValue4(listGejala4[0][2], listGejala4[1][2], listGejala4[2][1]));
        /*593*/valueOutput.add(8.0); rule.add(minValue4(listGejala4[0][2], listGejala4[1][2], listGejala4[2][2]));
    }
    
    public void rule5() {
        rule = new ArrayList();
        valueOutput = new ArrayList();
        
        /*0594*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0595*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0596*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0597*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0598*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0599*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0600*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0601*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0602*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0603*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0604*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0605*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0606*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0607*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0608*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0609*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0610*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0611*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0612*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0613*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0614*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0615*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0616*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0617*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0618*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0619*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0620*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0621*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0622*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0623*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0624*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0625*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0626*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0627*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0628*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0629*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0630*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0631*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0632*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0633*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0634*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0635*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0636*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0637*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0638*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0639*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0640*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0641*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0642*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0643*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0644*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0645*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0646*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0647*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0648*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0649*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0650*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0651*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0652*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0653*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0654*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0655*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0656*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0657*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0658*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0659*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0660*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0661*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0662*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0663*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0664*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0665*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0666*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0667*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0668*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0669*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0670*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0671*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0672*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0673*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0674*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0675*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0676*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0677*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0678*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0679*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0680*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0681*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0682*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0683*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0684*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0685*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0686*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0687*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0688*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0689*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0690*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0691*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0692*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0693*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0694*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0695*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0696*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0697*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0698*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0699*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0700*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0701*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0702*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0703*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0704*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0705*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0706*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0707*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0708*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0709*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0710*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0711*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0712*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0713*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0714*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0715*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0716*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0717*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0718*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0719*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0720*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0721*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0722*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0723*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0724*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0725*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0726*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0727*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0728*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0729*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0730*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0731*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0732*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0733*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0734*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0735*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0736*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0737*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0738*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0739*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0740*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0741*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0742*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0743*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0744*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0745*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0746*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0747*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0748*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0749*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0750*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0751*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0752*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0753*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0754*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0755*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0756*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0757*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0758*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0759*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0760*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0761*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0762*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0763*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0764*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0765*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0766*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0767*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0768*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0769*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0770*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0771*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0772*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0773*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0774*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0775*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0776*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0777*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0778*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0779*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0780*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0781*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0782*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0783*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0784*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0785*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0786*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0787*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0788*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0789*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0790*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0791*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0792*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0793*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0794*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0795*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0796*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0797*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0798*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0799*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0800*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0801*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0802*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0803*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0804*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0805*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0806*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0807*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0808*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0809*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0810*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0811*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0812*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0813*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0814*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0815*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0816*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0817*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0818*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0819*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0820*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0821*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0822*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0823*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0824*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0825*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0826*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0827*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0828*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0829*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0830*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0831*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0832*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0833*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0834*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0835*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0836*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][0], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0837*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0838*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0839*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0840*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0841*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0842*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0843*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0844*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0845*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0846*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0847*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0848*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0849*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0850*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0851*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0852*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0853*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0854*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0855*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0856*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0857*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0858*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0859*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0860*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0861*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0862*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0863*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0864*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0865*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0866*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0867*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0868*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0869*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0870*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0871*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0872*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0873*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0874*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0875*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0876*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0877*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0878*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0879*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0880*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0881*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0882*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0883*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0884*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0885*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0886*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0887*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0888*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0889*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0890*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0891*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0892*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0893*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0894*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0895*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0896*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0897*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0898*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0899*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0900*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0901*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0902*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0903*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0904*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0905*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0906*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0907*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0908*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0909*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0910*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0911*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0912*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0913*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0914*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0915*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0916*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0917*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0918*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0919*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0920*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0921*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0922*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0923*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0924*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0925*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0926*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0927*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0928*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0929*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0930*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0931*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0932*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0933*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0934*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0935*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0936*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0937*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0938*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0939*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0940*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0941*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0942*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0943*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0944*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0945*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0946*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0947*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0948*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0949*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0950*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0951*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0952*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0953*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0954*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0955*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0956*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0957*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0958*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0959*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0960*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0961*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0962*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0963*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0964*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0965*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0966*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0967*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0968*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0969*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0970*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0971*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0972*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*0973*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*0974*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*0975*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*0976*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*0977*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*0978*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*0979*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*0980*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*0981*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*0982*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*0983*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*0984*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*0985*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*0986*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*0987*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*0988*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*0989*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*0990*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*0991*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*0992*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*0993*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*0994*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*0995*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*0996*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*0997*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*0998*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*0999*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*1000*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*1001*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*1002*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*1003*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*1004*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*1005*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*1006*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*1007*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*1008*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*1009*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*1010*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*1011*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*1012*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*1013*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*1014*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*1015*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*1016*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*1017*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*1018*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*1019*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*1020*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*1021*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*1022*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*1023*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*1024*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*1025*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*1026*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*1027*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*1028*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*1029*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*1030*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*1031*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*1032*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*1033*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*1034*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*1035*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*1036*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*1037*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*1038*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*1039*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*1040*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*1041*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*1042*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*1043*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*1044*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*1045*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*1046*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*1047*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*1048*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*1049*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*1050*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*1051*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*1052*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*1053*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*1054*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*1055*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*1056*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*1057*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*1058*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*1059*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*1060*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*1061*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*1062*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*1063*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*1064*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*1065*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*1066*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*1067*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*1068*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*1069*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*1070*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*1071*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*1072*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*1073*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*1074*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*1075*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*1076*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*1077*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*1078*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*1079*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][1], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*1080*/valueOutput.add(2.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*1081*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*1082*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*1083*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*1084*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*1085*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*1086*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*1087*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*1088*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*1089*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*1090*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*1091*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*1092*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*1093*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*1094*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*1095*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*1096*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*1097*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*1098*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*1099*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*1100*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*1101*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*1102*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*1103*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*1104*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*1105*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*1106*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*1107*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*1108*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*1109*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*1110*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*1111*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*1112*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*1113*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*1114*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*1115*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*1116*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*1117*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*1118*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*1119*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*1120*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*1121*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*1122*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*1123*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*1124*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*1125*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*1126*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*1127*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*1128*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*1129*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*1130*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*1131*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*1132*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*1133*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*1134*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*1135*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*1136*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*1137*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*1138*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*1139*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*1140*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*1141*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*1142*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*1143*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*1144*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*1145*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*1146*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*1147*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*1148*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*1149*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*1150*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*1151*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*1152*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*1153*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*1154*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*1155*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*1156*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*1157*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*1158*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*1159*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*1160*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][0], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*1161*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*1162*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*1163*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*1164*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*1165*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*1166*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*1167*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*1168*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*1169*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*1170*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*1171*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*1172*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*1173*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*1174*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*1175*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*1176*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*1177*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*1178*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*1179*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*1180*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*1181*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*1182*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*1183*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*1184*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*1185*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*1186*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*1187*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*1188*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*1189*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*1190*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*1191*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*1192*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*1193*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*1194*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*1195*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*1196*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*1197*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*1198*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*1199*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*1200*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*1201*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*1202*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*1203*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*1204*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*1205*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*1206*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*1207*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*1208*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*1209*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*1210*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*1211*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*1212*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*1213*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*1214*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*1215*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*1216*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*1217*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*1218*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*1219*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*1220*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*1221*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*1222*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*1223*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*1224*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*1225*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*1226*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*1227*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*1228*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*1229*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*1230*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*1231*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*1232*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*1233*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*1234*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*1235*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*1236*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*1237*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*1238*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*1239*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*1240*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*1241*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][1], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*1242*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*1243*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*1244*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*1245*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*1246*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*1247*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*1248*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*1249*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*1250*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*1251*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*1252*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*1253*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*1254*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*1255*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*1256*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*1257*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*1258*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*1259*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*1260*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*1261*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*1262*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*1263*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*1264*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*1265*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*1266*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*1267*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*1268*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][0], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*1269*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*1270*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*1271*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*1272*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*1273*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*1274*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*1275*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*1276*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*1277*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*1278*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*1279*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*1280*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*1281*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*1282*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*1283*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*1284*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*1285*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*1286*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*1287*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*1288*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*1289*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*1290*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*1291*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*1292*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*1293*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*1294*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*1295*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][1], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
        /*1296*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][0]));
        /*1297*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][1]));
        /*1298*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][0], listGejala5[5][2]));
        /*1299*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][0]));
        /*1300*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][1]));
        /*1301*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][1], listGejala5[5][2]));
        /*1302*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][0]));
        /*1303*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][1]));
        /*1304*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][0], listGejala5[4][2], listGejala5[5][2]));
        /*1305*/valueOutput.add(5.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][0]));
        /*1306*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][1]));
        /*1307*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][0], listGejala5[5][2]));
        /*1308*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][0]));
        /*1309*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][1]));
        /*1310*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][1], listGejala5[5][2]));
        /*1311*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][0]));
        /*1312*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][1]));
        /*1313*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][1], listGejala5[4][2], listGejala5[5][2]));
        /*1314*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][0]));
        /*1315*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][1]));
        /*1316*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][0], listGejala5[5][2]));
        /*1317*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][0]));
        /*1318*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][1]));
        /*1319*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][1], listGejala5[5][2]));
        /*1320*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][0]));
        /*1321*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][1]));
        /*1322*/valueOutput.add(8.0); rule.add(minValue5(listGejala5[0][2], listGejala5[1][2], listGejala5[2][2], listGejala5[3][2], listGejala5[4][2], listGejala5[5][2]));
    }

    private double minValue1(double value1, double value2, double value3, double value4, double value5) {
        double value = 0;
        ArrayList<Double> list = new ArrayList<>();
        if (listGejalaBool1[0]) {
            list.add(value1);
        }
        if (listGejalaBool1[1]) {
            list.add(value2);
        }
        if (listGejalaBool1[2]) {
            list.add(value3);
        }
        if (listGejalaBool1[3]) {
            list.add(value4);
        }
        if (listGejalaBool1[4]) {
            list.add(value5);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) >= list.get(j)) {
                    value = list.get(j);
                }
            }
        }
        return value;
    }

    private double minValue2(double value1, double value2, double value3, double value4, double value5) {
        double value = 0;
        ArrayList<Double> list = new ArrayList<>();
        if (listGejalaBool2[0]) {
            list.add(value1);
        }
        if (listGejalaBool2[1]) {
            list.add(value2);
        }
        if (listGejalaBool2[2]) {
            list.add(value3);
        }
        if (listGejalaBool2[3]) {
            list.add(value4);
        }
        if (listGejalaBool2[4]) {
            list.add(value5);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) >= list.get(j)) {
                    value = list.get(j);
                }
            }
        }
        return value;
    }

    private double minValue3(double value1, double value2, double value3, double value4) {
        double value = 0;
        ArrayList<Double> list = new ArrayList<>();
        if (listGejalaBool3[0]) {
            list.add(value1);
        }
        if (listGejalaBool3[1]) {
            list.add(value2);
        }
        if (listGejalaBool3[2]) {
            list.add(value3);
        }
        if (listGejalaBool3[3]) {
            list.add(value4);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) >= list.get(j)) {
                    value = list.get(j);
                }
            }
        }
        return value;
    }

    private double minValue4(double value1, double value2, double value3) {
        double value = 0;
        ArrayList<Double> list = new ArrayList<>();
        if (listGejalaBool4[0]) {
            list.add(value1);
        }
        if (listGejalaBool4[1]) {
            list.add(value2);
        }
        if (listGejalaBool4[2]) {
            list.add(value3);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) >= list.get(j)) {
                    value = list.get(j);
                }
            }
        }
        return value;
    }

    private double minValue5(double value1, double value2, double value3, double value4, double value5, double value6) {
        double value = 0;
        ArrayList<Double> list = new ArrayList<>();
        if (listGejalaBool5[0]) {
            list.add(value1);
        }
        if (listGejalaBool5[1]) {
            list.add(value2);
        }
        if (listGejalaBool5[2]) {
            list.add(value3);
        }
        if (listGejalaBool5[3]) {
            list.add(value4);
        }
        if (listGejalaBool5[4]) {
            list.add(value5);
        }
        if (listGejalaBool5[5]) {
            list.add(value6);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) >= list.get(j)) {
                    value = list.get(j);
                }
            }
        }
        return value;
    }

    public void setListGejala1(double[][] listGejala1) {
        this.listGejala1 = listGejala1;
    }

    public void setListGejala2(double[][] listGejala2) {
        this.listGejala2 = listGejala2;
    }

    public void setListGejala3(double[][] listGejala3) {
        this.listGejala3 = listGejala3;
    }

    public void setListGejala4(double[][] listGejala4) {
        this.listGejala4 = listGejala4;
    }

    public void setListGejala5(double[][] listGejala5) {
        this.listGejala5 = listGejala5;
    }

    public void setListGejalaBool1(boolean[] listGejalaBool1) {
        this.listGejalaBool1 = listGejalaBool1;
    }

    public void setListGejalaBool2(boolean[] listGejalaBool2) {
        this.listGejalaBool2 = listGejalaBool2;
    }

    public void setListGejalaBool3(boolean[] listGejalaBool3) {
        this.listGejalaBool3 = listGejalaBool3;
    }

    public void setListGejalaBool4(boolean[] listGejalaBool4) {
        this.listGejalaBool4 = listGejalaBool4;
    }

    public void setListGejalaBool5(boolean[] listGejalaBool5) {
        this.listGejalaBool5 = listGejalaBool5;
    }

    public ArrayList<Double> getRule() {
        return rule;
    }

    public ArrayList<Double> getValueOutput() {
        return valueOutput;
    }
    
}
