package segurtasuna;

import junit.framework.TestCase;

public class OrdezkatzeHiztegiaTest extends TestCase {


    public void testZifratu() {
        OrdezkatzeHiztegia oh=new OrdezkatzeHiztegia();
        assertEquals(oh.zifratu("KaiXo"),"FZSIK");
        assertEquals(oh.zifratu("KAIXO"),"FZSIK");
        assertEquals(oh.zifratu("kaixo"),"FZSIK");
        assertEquals(oh.zifratu("agur"),"ZMTW");
        assertEquals(oh.zifratu("agUR"),"ZMTW");
        assertEquals(oh.zifratu("AGUR"),"ZMTW");
    }

    public void testDeszifratu() {
        OrdezkatzeHiztegia oh=new OrdezkatzeHiztegia();
        assertEquals(oh.deszifratu("FZSIK"),"KAIXO");
        assertEquals(oh.deszifratu("FZsiK"),"KAIXO");
        assertEquals(oh.deszifratu("fzsik"),"KAIXO");
        assertEquals(oh.deszifratu("ZMTW"),"AGUR");
        assertEquals(oh.deszifratu("zMTw"),"AGUR");
        assertEquals(oh.deszifratu("zmtw"),"AGUR");
    }
}