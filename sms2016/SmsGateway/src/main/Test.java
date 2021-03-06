package main;


import sms.GateWay;
import sms.ISmsClient;

/**
 * Created by Максим on 17.06.2016.
 */

public class Test {

    public static void main(String[] args) {
        FactorySms test=new FactorySms();
        ISmsClient  SmscRu,
                    SmsRu,
                    SmsGorod,
                    SmsAreo;
        SmscRu = test.getGateway(GateWay.SMSCRU,"faystmax","vfrcbvrf77");
        SmsRu = test.getGateway(GateWay.SMSRU,"79130825174","vfrcbvrf77");
        SmsGorod = test.getGateway(GateWay.SMSGOROD,"faystmax","vfrcbvrf77");
        SmsAreo = test.getGateway(GateWay.SMSAREO,"faystmax@gmail.com","vfrcbvrf77");
        
        //тест четырёх классов
        String balance1 = SmscRu.getBalance();
        String balance2 = SmsRu.getBalance();
        String balance3 = SmsGorod.getBalance();
        String balance4 = SmsAreo.getBalance();
        
        //String send1 = SmscRu.send("79130825174", "Test111");
        //String send2 = SmsRu.send("79130825174", "Test222");
        //String send3 = SmsGorod.send("79130825174", "Test333");
        //String send4 = SmsAreo.send("79130825174", "Test444");
        
        String smsCost1 = SmscRu.getCost("79130825174", "Test1");
        String smsCost2 = SmsRu.getCost("79130825174", "Test2");
    try{String smsCost3 = SmsGorod.getCost("79130825174", "Test3");} catch(Error e)  {System.out.println(e.getMessage());}
    try{String smsCost4 = SmsAreo.getCost("79130825174", "Test4");} catch(Error e)  {System.out.println(e.getMessage());}
        
        String status1 = SmscRu.getStatus("6", "79130825174");
        String status2 = SmsRu.getStatus("201625-1000000", "79130825174");
        String status3 = SmsGorod.getStatus("2810624896", "79130825174");
        String status4 = SmsAreo.getStatus("33894262", "79130825174");
    }
    
}
