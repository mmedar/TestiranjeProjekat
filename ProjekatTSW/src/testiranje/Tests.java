package testiranje;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({RegisterTest.class, LoginTest.class, ProveraInformacijaTest.class, KorpaTest.class, 
UkupnaCenaTest.class, StraniceTest.class, InformacijeTest.class, FacebookTest.class, InstagramTest.class,
TwitterTest.class, SearchTest.class })
public class Tests {
	
}
