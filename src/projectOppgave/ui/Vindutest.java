/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectOppgave.ui;

import javax.swing.*;

import com.sun.javafx.css.Combinator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Scanner;

import projectOppgave.core.ForsikringsRegister;
import projectOppgave.core.KundeRegister;
import projectOppgave.models.*;
import projectOppgave.models.BilForsikring.BilType;
import projectOppgave.models.BåtForsikring.BåtType;


public final class Vindutest extends JFrame{
    private static final long serialVersionUID = 1L;
    
    private JTextArea utskrift;
    private String filnavn = "Kunderliste.txt";
   
    //private JTextArea ;
    //private JTextArea utskrift;
    //private JTextArea utskrift;
    //private JTextArea utskrift ;
                                               
    private JScrollPane scrollUtskriftomrode;
    private JTextField navnfelt, alder, gateAdresse, gateNummer, postNummer, by, land;
    
    private JButton regKunde, regbil, Reghus, regfrithus,regbaat;
    
    private JButton SkrivUtReg,finnKunde,Slettkunde;
    
    private JTextField biltypefelt,regarfelt,regnrfelt,lengdefelt,bonusfelt,modellfelt,kunderNrfelt,Kundefeltk,KundeNrfeltb, 
    					årligPremierFelt, betingelserFelt, fBeløpFelt, bilPrisPerKmfelt, bilBonusfelt, andreInfoBilFelt;
    private JComboBox<BilType> bilTypeCombo;
    private JComboBox<BåtType> båtTypeCombo;
    
    private JTextField kunderNrfelt1,belopBfelt,belopIfelf,boligenAdressfelt,byggeaarfelt,boligtypefelt,byggematerailfelf,
                       standardfelt,Antall_kvadatmeterfelt,bounsfelt1;
    
    private JTextField kunderNrfelt2, belopBfelt1,belopIfelt1,boligenAdressfelt1,byggeaarfelt1,boligtypefelt1,byggematerailfelf1,
                        standardfelt1,Antall_kvadatmeterfelt1,bounsfelt2;
    private JTextField KundeNrfelt3,Regnr1felt1,Baattypefelt,modellfelt1,lengdefelt1,motorstyrkfelt,Årsmodellfelt,Motortypefelt,Bounsfelt4;
    
    private KundeRegister kundeRegister;
    private ForsikringsRegister forsikringsRegister;
    
    public Vindutest() throws IOException {
    	
        super("RUNTIME INSURANCE");
        
        this.kundeRegister = new KundeRegister();
        this.forsikringsRegister = new ForsikringsRegister();
        
        
       // lesregisterAvForsikiring(null);
        Lytter lytter = new Lytter();
        Container c = getContentPane();
        
        JPanel vestpanel = new JPanel();
        vestpanel.setLayout(new GridLayout(40, 1));
        vestpanel.add(new JLabel("KUNDER REGISTER"));
        
        JPanel ostpanel = new JPanel();
        ostpanel.setLayout(new GridLayout(30, 1));
        ostpanel.add(new JLabel("KUNDERREGISTER"));
        
        JPanel registeringsPanel = new JPanel();
        registeringsPanel.add(vestpanel);
        c.add(registeringsPanel,BorderLayout.WEST);
        
        JPanel registeringsPanel2 = new JPanel();
        registeringsPanel2.add(ostpanel);
        c.add(registeringsPanel2,BorderLayout.EAST);
        
        JPanel p39 = new JPanel();
        p39.setLayout(new GridLayout(1, 2));
        Kundefeltk = new JTextField(20);
        Kundefeltk.setEnabled(false);
        Kundefeltk.addActionListener(lytter);
        p39.add(new JLabel("KunderNR"));
        p39.add(Kundefeltk);
        vestpanel.add(p39);
           
        //navn
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,2));
        navnfelt = new JTextField(20);
        navnfelt.addActionListener(lytter);
        p1.add(new JLabel("Kundes navn: "));
        p1.add(navnfelt);
        vestpanel.add(p1);
        
        //Alder
        JPanel panelAlder = new JPanel();
        panelAlder.setLayout(new GridLayout(1,2));
        alder = new JTextField(20);
        alder.addActionListener(lytter);
        panelAlder.add(new JLabel("Kundes alder: "));
        panelAlder.add(alder);
        vestpanel.add(panelAlder);
        
        //gateAdresse
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,2));
        gateAdresse = new JTextField(20);
        gateAdresse.addActionListener(lytter);
        p2.add(new JLabel("Gate Adresse: "));
        p2.add(gateAdresse);
        vestpanel.add(p2);
        
        //gateNummer
        JPanel panelGateNummer = new JPanel();
        panelGateNummer.setLayout(new GridLayout(1,2));
        gateNummer = new JTextField(20);
        gateNummer.addActionListener(lytter);
        panelGateNummer.add(new JLabel("Gate Nummer: "));
        panelGateNummer.add(gateNummer);
        vestpanel.add(panelGateNummer);
        
        //postNummer
        JPanel panelpostNummer = new JPanel();
        panelpostNummer.setLayout(new GridLayout(1,2));
        postNummer = new JTextField(20);
        postNummer.addActionListener(lytter);
        panelpostNummer.add(new JLabel("Post Nummer: "));
        panelpostNummer.add(postNummer);
        vestpanel.add(panelpostNummer);
        
        //by
        JPanel panelBy = new JPanel();
        panelBy.setLayout(new GridLayout(1,2));
        by = new JTextField(20);
        by.addActionListener(lytter);
        panelBy.add(new JLabel("By: "));
        panelBy.add(by);
        vestpanel.add(panelBy);
        
        //land
        JPanel panelLand = new JPanel();
        panelLand.setLayout(new GridLayout(1,2));
        land = new JTextField(20);
        land.addActionListener(lytter);
        panelLand.add(new JLabel("Land: "));
        panelLand.add(land);
        vestpanel.add(panelLand);
        
               
          
        
        
        
        
           // nedre er intiatsjon av JBOtton  
           JPanel Knappepanel =  new JPanel(); 
             Knappepanel.setLayout(new GridLayout(1, 3)); 
             regKunde = new JButton("NY Kunde");
             regKunde.addActionListener(lytter);
             Slettkunde = new JButton("Slett Kunde");
             Slettkunde.addActionListener(lytter);
             finnKunde = new JButton("Finn kunde");
             finnKunde.addActionListener(lytter);
              
             Knappepanel.add(finnKunde);
             Knappepanel.add(regKunde);
             Knappepanel.add(Slettkunde);
             vestpanel.add(Knappepanel);
             
             JPanel Knappepanel2 = new JPanel();
             Knappepanel2.setLayout(new GridLayout(1, 2));
             c.add(Knappepanel2,BorderLayout.SOUTH);
             vestpanel.add(Knappepanel2,BorderLayout.SOUTH);
             
//             JPanel Kanppepanel2 = new JPanel();
//             Knappepanel2.setLayout(new GridLayout(1, 2));
//             Slettkunde = new JButton("slett Kunde");
//             Slettkunde.addActionListener(lytter);
//             Knappepanel2.add(Slettkunde);
//             vestpanel.add(Knappepanel2);
//             
//             
           //vestpanel.add(new JLabel("BIL FORSIKIRING"));
           vestpanel.setBorder(BorderFactory.createTitledBorder("FORSIKIRING"));
           
           JPanel p6 = new JPanel();
           p6.setLayout(new GridLayout(1,2));
           regnrfelt = new JTextField(20);
           regnrfelt.addActionListener(lytter);
           p6.add(new JLabel("RegistreringsNummer"));
           p6.add(regnrfelt);
           vestpanel.add(p6);
           
           
           JPanel p9 = new JPanel();
           p9.setLayout(new GridLayout(1, 2));
           KundeNrfeltb= new JTextField(20);
           KundeNrfeltb.addActionListener(lytter);
           p9.add(new JLabel("KunderNR"));
           p9.add(KundeNrfeltb);
           vestpanel.add(p9);
           
           
          
          	
           //EXTRA
           JPanel panelÅrligPremier = new JPanel();
           panelÅrligPremier.setLayout(new GridLayout(1, 2));
           årligPremierFelt= new JTextField(20);
           årligPremierFelt.addActionListener(lytter);
           panelÅrligPremier.add(new JLabel("årlig Premie"));
           panelÅrligPremier.add(årligPremierFelt);
           vestpanel.add(panelÅrligPremier);
           //
           JPanel panelBetingelser = new JPanel();
           panelBetingelser.setLayout(new GridLayout(1, 2));
           betingelserFelt= new JTextField(20);
           betingelserFelt.addActionListener(lytter);
           panelBetingelser.add(new JLabel("betingelser"));
           panelBetingelser.add(betingelserFelt);
           vestpanel.add(panelBetingelser);
           
           
           //
           JPanel panelBeløp = new JPanel();
           panelBeløp.setLayout(new GridLayout(1, 2));
           fBeløpFelt= new JTextField(20);
           fBeløpFelt.addActionListener(lytter);
           panelBeløp.add(new JLabel("Beløp"));
           panelBeløp.add(fBeløpFelt);
           vestpanel.add(panelBeløp);
           
           
           /*
           JPanel p3 = new JPanel();
           p3.setLayout(new GridLayout(1, 2));
            biltypefelt = new JTextField(20);
            biltypefelt.addActionListener(lytter);
            p3.add(new JLabel("Biltype"));
             p3.add(biltypefelt);
            vestpanel.add(p3);
            */
           
           
           JPanel p3 = new JPanel();
           p3.setLayout(new GridLayout(1, 2));
           bilTypeCombo = new JComboBox<BilForsikring.BilType>();
           bilTypeCombo.setModel(new DefaultComboBoxModel<>(BilForsikring.BilType.values()));
           
           bilTypeCombo.addActionListener(lytter);
           p3.add(new JLabel("Biltype"));
           p3.add(bilTypeCombo);
           vestpanel.add(p3);
            
           
            JPanel p5 = new JPanel();
            p5.setLayout(new GridLayout(1, 2));
            modellfelt = new JTextField(20);
            modellfelt.addActionListener(lytter);
            p5.add(new JLabel(" Bil Modell"));
             p5.add(modellfelt);
            vestpanel.add(p5);
            
            
            JPanel p4 = new JPanel();
            p4.setLayout(new GridLayout(1, 2));
            regarfelt = new JTextField(20);
            regarfelt.addActionListener(lytter);
            p4.add(new JLabel("Registreringsår"));
             p4.add(regarfelt);
            vestpanel.add(p4);
            
            //
            JPanel panelPrisPerKm = new JPanel();
            panelPrisPerKm.setLayout(new GridLayout(1, 2));
            bilPrisPerKmfelt = new JTextField(20);
            bilPrisPerKmfelt.addActionListener(lytter);
            panelPrisPerKm.add(new JLabel("Pris per Kilometer"));
            panelPrisPerKm.add(bilPrisPerKmfelt);
            vestpanel.add(panelPrisPerKm);
            
            //
            JPanel panelBonus = new JPanel();
            panelBonus.setLayout(new GridLayout(1, 2));
            bilBonusfelt = new JTextField(20);
            bilBonusfelt.addActionListener(lytter);
            panelBonus.add(new JLabel("Bonus "));
            panelBonus.add(bilBonusfelt);
            vestpanel.add(panelBonus);
            
            //
            JPanel panelAndreInfo = new JPanel();
            panelAndreInfo.setLayout(new GridLayout(1, 2));
            andreInfoBilFelt = new JTextField(20);
            andreInfoBilFelt.addActionListener(lytter);
            panelAndreInfo.add(new JLabel("Andre Info"));
            panelAndreInfo.add(andreInfoBilFelt);
            vestpanel.add(panelAndreInfo);
            
            
            JPanel p7 =new JPanel();
            p7.setLayout(new GridLayout(1, 2));
            lengdefelt = new JTextField(20);
            lengdefelt.addActionListener(lytter);
            p7.add(new JLabel("Kjorelengde"));
            p7.add(lengdefelt);
            vestpanel.add(p7);
           
            regbil = new JButton("Tegn bilforsikring");
            regbil.addActionListener(lytter);
             Knappepanel.add(regbil);
             vestpanel.add(regbil);
             
             vestpanel.add(new JLabel("HUS FORSIKIRING"));
            
             
             JPanel p10 = new JPanel();
             p10.setLayout(new GridLayout(1, 2));
             kunderNrfelt1 = new JTextField(20);
             kunderNrfelt1.addActionListener(lytter);
             p10.add(new JLabel("KundreNr"));
             p10.add(kunderNrfelt1);
             vestpanel.add(p10);
             
             JPanel p11 = new JPanel();
             p11.setLayout(new GridLayout(1, 2));
             boligenAdressfelt = new JTextField(20);
             boligenAdressfelt.addActionListener(lytter);
             p11.add(new JLabel("BoligenAdress"));
             p11.add(boligenAdressfelt);
             vestpanel.add(p11);
             
             JPanel p12 = new JPanel();
             p12.setLayout(new GridLayout(1, 2));
             byggeaarfelt = new JTextField(20);
             byggeaarfelt.addActionListener(lytter);
             p12.add(new JLabel("ByggeÅr"));
             p12.add(byggeaarfelt);
             vestpanel.add(p12);
             
             JPanel p13 = new JPanel();
             p13.setLayout(new GridLayout(1, 2));
             boligtypefelt = new JTextField(20);
             boligtypefelt.addActionListener(lytter);
             p13.add(new JLabel("BoligType"));
             p13.add(boligtypefelt);
             vestpanel.add(p13);
             
             
             JPanel p14 = new JPanel();
             p14.setLayout(new GridLayout(1, 2));
             byggematerailfelf = new JTextField(20);
             byggematerailfelf.addActionListener(lytter);
             p14.add(new JLabel("ByggeMaterial"));
             p14.add(byggematerailfelf);
             vestpanel.add(p14);
             
             JPanel p15 = new JPanel();
             p15.setLayout(new GridLayout(1, 2));
             standardfelt = new JTextField(20);
             standardfelt.addActionListener(lytter);
             p15.add(new JLabel("Standard"));
             p15.add(standardfelt);
             vestpanel.add(p15);
             
             JPanel p16 = new JPanel();
             p16.setLayout(new GridLayout(1, 2));
             Antall_kvadatmeterfelt = new JTextField(20);
             Antall_kvadatmeterfelt.addActionListener(lytter);
             p16.add(new JLabel("Antall_kvadratmeter"));
             p16.add(Antall_kvadatmeterfelt);
             vestpanel.add(p16);
             
             JPanel p24 = new JPanel();
             p24.setLayout(new GridLayout(1, 2));
             belopBfelt = new JTextField(20);
             belopBfelt.addActionListener(lytter);
             p24.add(new JLabel("BelopB"));
             p24.add(belopBfelt);
             vestpanel.add(p24);
             
             JPanel p25 = new JPanel();
             p25.setLayout(new GridLayout(1, 2));
             belopIfelf = new JTextField(20);
             belopIfelf.addActionListener(lytter);
             p25.add(new JLabel("BelopI"));
             p25.add(belopIfelf);
             vestpanel.add(p25);
             
             JPanel p26 = new JPanel();
             p26.setLayout(new GridLayout(1, 2));
             bounsfelt1 = new JTextField(20);
             bounsfelt1.addActionListener(lytter);
             p26.add(new JLabel("Bonus"));
             p26.add(bounsfelt1);
             vestpanel.add(p26);
             
             
            Reghus = new JButton("Tegn HusogInnforsikring");
            Reghus.addActionListener(lytter);
             Knappepanel.add(Reghus);
             vestpanel.add(Reghus);
             
             
             ostpanel.add(new JLabel("FRITIDSBO FORSIKIRING"));
            
             JPanel p17 = new JPanel();
             p17.setLayout(new GridLayout(1, 2));
             kunderNrfelt2 = new JTextField(20);
             kunderNrfelt2.addActionListener(lytter);
             p17.add(new JLabel("KundreNr"));
             p17.add(kunderNrfelt2);
             ostpanel.add(p17);
             
              
             JPanel p18 = new JPanel();
             p18.setLayout(new GridLayout(1, 2));
             boligenAdressfelt1 = new JTextField(20);
             boligenAdressfelt1.addActionListener(lytter);
             p18.add(new JLabel("Bolig Adresse"));
             p18.add(boligenAdressfelt1);
             ostpanel.add(p18);
             
             JPanel p19 = new JPanel();
             p19.setLayout(new GridLayout(1, 2));
             byggeaarfelt1 = new JTextField(20);
             byggeaarfelt1.addActionListener(lytter);
             p19.add(new JLabel("ByggeÅr"));
             p19.add(byggeaarfelt1);
             ostpanel.add(p19);
             
             JPanel p20 = new JPanel();
             p20.setLayout(new GridLayout(1, 2));
             boligtypefelt1 = new JTextField(20);
             boligtypefelt1.addActionListener(lytter);
             p20.add(new JLabel("BoligType"));
             p20.add(boligtypefelt1);
             ostpanel.add(p20);
             
             
             JPanel p21 = new JPanel();
             p21.setLayout(new GridLayout(1, 2));
             byggematerailfelf1 = new JTextField(20);
             byggematerailfelf1.addActionListener(lytter);
             p21.add(new JLabel("ByggeMaterial"));
             p21.add(byggematerailfelf1);
             ostpanel.add(p21);
             
             JPanel p22 = new JPanel();
             p22.setLayout(new GridLayout(1, 2));
             standardfelt1 = new JTextField(20);
             standardfelt1.addActionListener(lytter);
             p22.add(new JLabel("Standard"));
             p22.add(standardfelt1);
             ostpanel.add(p22);
             
             JPanel p23 = new JPanel();
             p23.setLayout(new GridLayout(1, 2));
             Antall_kvadatmeterfelt1 = new JTextField(20);
             Antall_kvadatmeterfelt1.addActionListener(lytter);
             p23.add(new JLabel("Antall_kvadratmeter"));
             p23.add(Antall_kvadatmeterfelt1);
             ostpanel.add(p23);
             
             JPanel p27 = new JPanel();
             p27.setLayout(new GridLayout(1, 2));
             belopBfelt1 = new JTextField(20);
             belopBfelt1.addActionListener(lytter);
             p27.add(new JLabel("BeløpB"));
             p27.add(belopBfelt1);
             ostpanel.add(p27);
             
             JPanel p28 = new JPanel();
             p28.setLayout(new GridLayout(1, 2));
             belopIfelt1 = new JTextField(20);
             belopIfelt1.addActionListener(lytter);
             p28.add(new JLabel("BeløpI"));
             p28.add(belopIfelt1);
             ostpanel.add(p28);
             
             
             JPanel p29 = new JPanel();
             p29.setLayout(new GridLayout(1, 2));
             bounsfelt2 = new JTextField(20);
             bounsfelt2.addActionListener(lytter);
             p29.add(new JLabel("Bonus"));
             p29.add(bounsfelt2);
             ostpanel.add(p29);
             
            regfrithus = new JButton("Tegn Fritidsforsikring");
            regfrithus.addActionListener(lytter);
             Knappepanel.add(regfrithus);
             ostpanel.add(regfrithus);
             
             
             ostpanel.add(new JLabel("BAAT FORSIKIRING"));
             
             JPanel p30 = new JPanel();
             p30.setLayout(new GridLayout(1, 2));
              KundeNrfelt3 = new JTextField(20);
             KundeNrfelt3.addActionListener(lytter);
             p30.add(new JLabel("KunderNr"));
             p30.add(KundeNrfelt3);
             ostpanel.add(p30);
             
               JPanel p31 = new JPanel();
             p31.setLayout(new GridLayout(1, 2));
            Regnr1felt1 = new JTextField(20);
             Regnr1felt1.addActionListener(lytter);
             p31.add(new JLabel("Registrerings Nummer"));
             p31.add(Regnr1felt1);
             ostpanel.add(p31);
             
               JPanel p32 = new JPanel();
             p32.setLayout(new GridLayout(1, 2));
             Baattypefelt = new JTextField(20);
             Baattypefelt.addActionListener(lytter);
             p32.add(new JLabel("Båt type"));
             p32.add(Baattypefelt);
             ostpanel.add(p32);
             
             JPanel p33 = new JPanel();
             p33.setLayout(new GridLayout(1, 2));
             modellfelt1 = new JTextField(20);
             modellfelt1.addActionListener(lytter);
             p33.add(new JLabel("Båt modell"));
             p33.add(modellfelt1);
             ostpanel.add(p33);
             
               JPanel p34 = new JPanel();
             p34.setLayout(new GridLayout(1, 2));
             lengdefelt1 = new JTextField(20);
             lengdefelt1.addActionListener(lytter);
             p34.add(new JLabel("Båt lengde"));
             p34.add(lengdefelt1);
             ostpanel.add(p34);
             
               JPanel p35 = new JPanel();
             p35.setLayout(new GridLayout(1, 2));
             Årsmodellfelt = new JTextField(20);
             Årsmodellfelt.addActionListener(lytter);
             p35.add(new JLabel("Årsmodell"));
             p35.add(Årsmodellfelt);
             ostpanel.add(p35);
             
               JPanel p36 = new JPanel();
             p36.setLayout(new GridLayout(1, 2));
             Motortypefelt = new JTextField(20);
             Motortypefelt.addActionListener(lytter);
             p36.add(new JLabel("Motortype"));
             p36.add(Motortypefelt);
             ostpanel.add(p36);
             
               JPanel p37 = new JPanel();
             p37.setLayout(new GridLayout(1, 2));
             Bounsfelt4 = new JTextField(20);
             Bounsfelt4.addActionListener(lytter);
             p37.add(new JLabel("Bonus"));
             p37.add(Bounsfelt4);
             ostpanel.add(p37);
             
             JPanel p38 = new JPanel();
             p38.setLayout(new GridLayout(1, 2));
             motorstyrkfelt = new JTextField(20);
             motorstyrkfelt.addActionListener(lytter);
             p38.add(new JLabel("MotorStyrk"));
             p38.add(motorstyrkfelt);
             ostpanel.add(p38);
             
            regbaat = new JButton("Tegn Båtforsikring");
            regbaat.addActionListener(lytter);
             Knappepanel.add(regbaat);
             ostpanel.add(regbaat);
             
             ostpanel.setBorder(BorderFactory.createTitledBorder("FORSIKIRING")); 
             
            
            scrollUtskriftomrode = new JScrollPane();
             
           JPanel utskriftspanel = new JPanel();
            utskrift = new JTextArea(50,50);
            utskriftspanel.add(new JScrollPane(utskrift));
            c.add(utskriftspanel,BorderLayout.CENTER);
            utskrift.setFont(new java.awt.Font("Monospaced", 0, 12));
            SkrivUtReg = new JButton(" VIS REG K");
            SkrivUtReg.addActionListener(lytter);
            Knappepanel.add(SkrivUtReg);
            utskriftspanel.add(SkrivUtReg,BorderLayout.SOUTH);
            
          
            setSize(800, 560);
            setVisible(true);
            utskrift.setEditable(false);
            
//            lesFil();
//            //skrivFil();
//            SkrivObjectTilFil(filnavn);
            pack();
        
    }
    
//    /**
//     * en leser method som lesser tegn får tgn
//     * med en Excepton som fanger opp mangde av fil
//     * @throws IOException 
//     */
//    public void lesFil() throws IOException{
//        
//        BufferedReader innfil = null;
//         try{
//             innfil = new BufferedReader(new FileReader(filnavn));
//             
//             String list = null;
//             do{
//                 list = innfil.readLine();
//                 if(list != null){
//                     
//                     Scanner leser = new Scanner(list);
//                     leser.useDelimiter("[,\\s]+");
//                     
//                     String kunderlister = null;
//                     if(leser.hasNext()){
//                         kunderlister = leser.next();
//                         String knr = null;
//                         if(leser.hasNext())
//                             knr = leser.next();
//                       if(kunderlister != null && knr != null)
//                           lister.leggTilKunde(new Kunde(knr, kunderlister, null));
//                               leser.close();   
//                     }
//                 }
//             }while(list != null);
//             innfil.close();
//         }catch(FileNotFoundException fnf){
//             
//             JOptionPane.showMessageDialog(this, "manglende fil", "Finner ikke fil"
//             + filnavn, JOptionPane.WARNING_MESSAGE);
//                     
//         }catch(IOException ioe){
//             
//             JOptionPane.showMessageDialog(this,"Filproblem",
//  				"Problem med å lese fra fil " + filnavn,
//  				JOptionPane.WARNING_MESSAGE);
//             
//         }
//    }
//    /**
//     * Denne skrive fil av liste
//     * @throws FileNotFoundException 
//     */
//    public void skrivFil() throws FileNotFoundException{
//        
//        lister.skrivFil(filnavn);
//    }
//    
//    /**
//     * den method viser alle som er registert
//     */
//    public void skrivUtListe(){
//        
//        utskrift.setText(lister.toString());
//    }
//
//    
//    /**
//     * skive eller liste for forsikiring
//     * @param forsikringsObj
//     * @return 
//     * @throws java.io.FileNotFoundException 
//     */
//    public static HashSet<Forsikring> lesregisterAvForsikiring(HashSet<Forsikring> forsikringsObj) throws FileNotFoundException{
//        try {
//            InputStream file = new FileInputStream("forsikringsObjecterList");
//            InputStream buffer = new BufferedInputStream(file);
//            File f = new File("forsikringsObjecterList");
//            if(f.length()!= 0){
//                try(ObjectInput input = new ObjectInputStream(buffer)){
//                    @SuppressWarnings("unchecked")
//                    HashSet<Forsikring> historic = (HashSet<Forsikring>)input.readObject();
//                    historic.stream().forEach((Forsikring _item) -> {
//                        //labda predication
//                        forsikringsObj.addAll(historic);
//                    });
//                }//end of inner try som fanger skrivelsen av de forskjell lister
//            }
//        } catch (ClassNotFoundException|IOException cfe) {
//            return null;
//        }//end of catch
//        return forsikringsObj;
//    }
//    /**
//     * av suraj Tamrakar
//     * 
//     * @param filnavn
//     * @throws IOException 
//     */
//    public void SkrivObjectTilFil(String filnavn) throws IOException{
//        try(ObjectOutputStream fil = new ObjectOutputStream(new FileOutputStream(filnavn + "lister.kunder"))){
//            Kunde ny = new Kunde(filnavn, filnavn, null);
//            fil.writeInt(ny.getNesteNr());
//            fil.writeObject(lister);
//        }catch(NotSerializableException nse){
//            
//            System.out.println("lister.kunde NotSerializableException");   
//        }catch(IOException ioe){
//            System.out.println("listerregister.kunde filfeil");
//            
//        }try(ObjectOutputStream fil = new ObjectOutputStream(new FileOutputStream(filnavn+"kunderslisre"))){
//            fil.writeObject(lister);
//        }catch(NotSerializableException nse){
//            
//            System.err.println("objectsregister NotSerializableException");
//            
//        }catch(IOException ioe){
//            System.err.println("objectsregister filfeil");
//        }
//    }
//    /**
//     * 
//     * @param filnavn 
//     */
//    public void lesObjektFraFil(String filnavn){
//        
//    }
//    /**
//     * av Arash Amini s156127
//     * sletter felt etter registering
//     */

//    /**
//     * av Lunga majola s929577
//     * register en person
//     */
//    public void leggTilKunde(){
//        
//    	//if setningen som fanger felt og gir tilbak melding
//        if(navnfelt.getText().equals("") && adressefelt.getText().equals("")){
//            melding("Du må fylle ut navnfelt og adresefelt");
//            return;
//        }
//        
//        String navn = navnfelt.getText();
//        String adr = adressefelt.getText();
//        
//        Kunde k = new Kunde(navn, adr, null);
//        
//       
//        //int kunderNr = k.getKundeNr();
//        slettFelter();
//         
//       boolean ok = lister.leggTilKunde(k);//kall av metoden til å registerer
//       if(ok){
//           //melding("ok worked");
//           utskrift.setText(lister.viskunde());
//           Kundefeltk.setText(Integer.toString(k.getKundeNr()));//her setter vi den nye kunder i felter till alle forsikiring objecker vi har på vindu
//           KundeNrfelt3.setText(Integer.toString(k.getKundeNr()));//her setter vi den nye kunder i felter till alle forsikiring objecker vi har på vindu
//           kunderNrfelt1.setText(Integer.toString(k.getKundeNr()));//her setter vi den nye kunder i felter till alle forsikiring objecker vi har på vindu
//           KundeNrfeltb.setText(Integer.toString(k.getKundeNr()));//her setter vi den nye kunder i felter till alle forsikiring objecker vi har på vindu
//           kunderNrfelt2.setText(Integer.toString(k.getKundeNr()));//her setter vi den nye kunder i felter till alle forsikiring objecker vi har på vindu
//         //utskrift.append(k.toString());
//       }else{
//           utskrift.setText("Det gikk ikke");
//          
//       }
//         
//    }/**
//     * av suraj Tamrakar s929610
//     * finner en kunder ved bruke av knr
//     */
//    public void finnKunde(){
//        if(Kundefeltk.getText().equals("")){
//            melding("Du må fylle ut kunderfelt til kunder");
//            return;
//       
//       }
//            
//        int f = Integer.parseInt(Kundefeltk.getText());
//        Kunde k = lister.finnKunder(f);
//        slettFelter();
//        
//        if(k == null){
//            utskrift.setText("Finner ikke kunder med KunderNr. " + f);
//        }else{
//            utskrift.setText(k.toString());
//            //
//        }
//        //utskrift.append(k.toString());
//        Kundefeltk.setText("");
//        utskrift.setCaretPosition(0);
//    }
//    /**
//     * av Arash Amini s156127
//     * fjern av en kunder fra register
//     */
//    public void fjernKunde(){
//       
//        if (Kundefeltk.getText().equals("")){
//           melding("Du må fylle ut KunderNr felt i kunde register");
//            return;
//        }
//        int f = Integer.parseInt(Kundefeltk.getText());
//        
//          boolean ok = lister.fjernKunde(f);
//           if (ok)
//             utskrift.setText("er fjernet");
//           else
//           {
//               utskrift.setText("Er ikke fjernt");
//           }
//       
//    }
//    /**
//     * av Suraj Tamrakar s929610
//     * den setter inn husetforsiking
//     */
//      public void leggTilHusoginnboForsikiring(){
//          
//            String boligtype = boligtypefelt.getText();
//            String boligensAdresse = boligenAdressfelt.getText();
//            String byggemateriale = byggematerailfelf.getText();
//            String standard = standardfelt.getText();
//            
//          if(  boligenAdressfelt.getText().equals("") ||boligtypefelt.getText().equals("") ||
//               byggematerailfelf.getText().equals("") || standardfelt.getText().equals("") ||
//                  Antall_kvadatmeterfelt.getText().equals("")){
//              
//              melding("Du må fylle ute text feltene");
//          return;
//          }try{
//              int knr = Integer.parseInt(kunderNrfelt1.getText());
//              int byggearr = Integer.parseInt(byggeaarfelt.getText());
//              int Antallk = Integer.parseInt(Antall_kvadatmeterfelt.getText());
//              int b = Integer.parseInt(belopBfelt.getText());
//              int i = Integer.parseInt(belopIfelf.getText());
//              int bonus = Integer.parseInt(bounsfelt1.getText());
//              //int kunderNR = Integer.parseInt(kunderNrfelf1.getText());
//              
//             lister.leggTilHusoginnboForsikiring(new Husoginnboforsikring(knr,boligensAdresse, boligtype, null, byggemateriale, Antallk, b, i, byggearr, standard, bonus));
//             Kunde k = lister.finnKunder(knr);
//             
//             if(!(k == null)){
//                 
//             k.addHus(new Husoginnboforsikring(knr,boligensAdresse, boligtype, null, byggemateriale, Antallk, b, i, byggearr, standard, bonus));
//             //here setter vi en hus til en pesron
//             
//             }//end if om check if det exister fra før
//            
//             melding("Huset dit er nå forsikirert" + knr);
//             utskrift.setText(lister.viskunde() + " er nå forsikret " + "\n" +lister.visHusogInnbo());
//              slettFelter();//slett av felter
//              
//          }catch(NumberFormatException nfe){
//              
//              melding("Ingen registrering pga. feil i tallformat");
//          }
//    
//      }
//      
//    /**
//     * av Arash Amini s156127
//     *legg til en bil ved hjelp av regex
//     */
//    
//    /**
//     * legger till en fritidhus forsikring
//     */
//    
//   public void leggTilFridsboligForsikiring(){
//       
//       String adresse1 = boligenAdressfelt1.getText();
//       String BoligT = boligtypefelt1.getText();
//       String ByggeM = byggematerailfelf1.getText();
//       String Stand = standardfelt1.getText();
//       
//       if(boligenAdressfelt1.getText().equals("") || boligtypefelt1.getText().equals("") ||
//               byggematerailfelf1.getText().equals("") || standardfelt1.getText().equals("")){
//          
//           melding("boligenAress \n boligtype \n byggematerial \nstandard \n MÅ VÆRE AV STRING TYPE");
//            return;
//       }try{
//           
//           int knr = Integer.parseInt(kunderNrfelt2.getText());
//           int Bår = Integer.parseInt(byggeaarfelt1.getText());
//           int Antk = Integer.parseInt(Antall_kvadatmeterfelt1.getText());
//           int Bb  = Integer.parseInt(belopBfelt1.getText());
//           int BI = Integer.parseInt(belopIfelt1.getText());
//           int Bun = Integer.parseInt(bounsfelt1.getText());
//           
//          lister.leggTilFridsboligForsikiring(new FritidsboligForsikiring(adresse1, null, BoligT, ByggeM, Stand, BI, Bb, Bår, Antk, Bun, knr));
//          
//         Kunde k = lister.finnKunder(knr);
//         if(!(k == null)){
//             k.addFritidshus(new FritidsboligForsikiring(adresse1, null, BoligT, ByggeM, Stand, BI, Bb, Bår, Antk, Bun, knr));
//             //legger til en fritids hus på kunder
//         }//end of if
//         
//        melding("Huset dit er nå forsikirert" + knr);
//             utskrift.setText(lister.viskunde() + " er nå forsikret " + "\n" +lister.visFritidsbo());
//              slettFelter();//slett av felter
//             
//                   
//       }catch(NumberFormatException e){
//           
//            melding("Ingen registrering pga. feil i tallformat");
//       }//end of try catch
//       
//   }
//    
//   /**
//    * av Lunga majola s929577
//    */
//   public void leggTilbaatForsikiring(){
//       
//          String pattern = "[A-Za-z]{4}[0-9]{3}";//regex
//          
//           if(!(Regnr1felt1.getText().toUpperCase().matches(pattern))){
//               
//            JOptionPane.showMessageDialog( null, "Registreringsnummeret må \nbestå av 4 bokstaver og 3 tall\neks: BBBB111","FEIL INPUT",JOptionPane.ERROR_MESSAGE);
//            
//          }//her skjeke vis det er en bil far forrige
//          else if(lister.finnBaat(Regnr1felt1.getText().toUpperCase())!=null){
//            
//            JOptionPane.showMessageDialog(null, "En b med samme registreringsnumer finnes fra før","FEIL INPUT",JOptionPane.ERROR_MESSAGE);
//            
//        }
//          else if(!(Regnr1felt1.getText().length() ==0 || modellfelt1.getText().length()==0 || 
//                  KundeNrfelt3.getText().length()== 0 || Baattypefelt.getText().length() ==0 ||
//                  lengdefelt1.getText().length()==0 ||Årsmodellfelt.getText().length()==0 ||
//                  Motortypefelt.getText().length() ==0))//tester hvis feltene er tomt og returner det må fills ut
//          
//          {
//          
//         }else{
//               melding(" Du må fylle ut alle feltene ");
//      
//          }try {
//              int knr = Integer.parseInt(KundeNrfelt3.getText());
//              int year2 = Integer.parseInt(Årsmodellfelt.getText());
//              int legd2 = Integer.parseInt(lengdefelt1.getText());
//              int Mots = Integer.parseInt(motorstyrkfelt.getText());
//              int bon = Integer.parseInt(Bounsfelt4.getText());
//              
//              lister.leggTilbaatForsikiring(new BaatForsikring(null, Årsmodellfelt.getText(), Baattypefelt.getText(), modellfelt1.getText(), 
//                      legd2, Mots, Motortypefelt.getText(), bon, Mots, Mots, knr));
//              Kunde k = lister.finnKunder(knr);
//              slettFelter();//sletter textfield etter at en bilforskring er registert
//             if(k!=null){
//              
//              k.addBaat(new BaatForsikring(null, Årsmodellfelt.getText(), Baattypefelt.getText(), 
//                      lengdefelt1.getText(), legd2, year2, modellfelt.getText(),
//                      Motortypefelt.getText().length(), Bounsfelt4.getText().length(), Mots, knr));
//             }//setter en bill objeck til en kunder ved å henter det fra kunde class
//             melding("\"Båten dit er nå forsikirert\" + knr");
//            
//             utskrift.setText(lister.toString() +"er nå forsikret " + "\n" + lister.visbaat());
//             
//             slettFelter();//sletting av text field
//             
//       } catch (NumberFormatException nfe) {
//           
//           melding("Ingen registrering pga. feil i tallformat på felter \n Årsmodell \n eller Båt lengde \n moterstyrk");
//       }
//   }
//
//    /**
//     * prøve method ikke implementet på vindu
//     */
//    public void tegnBilForsikring() {
//          String type = "";
//          int regår = -1;
//          String regnr = "111";
//          int lengde = -1;
//          double bonus = -1;
//          boolean failed = false;
//     
//      try {
//       
//        type = biltypefelt.getText(); 
//        regår = Integer.parseInt(regarfelt.getText());
//        regnr = regnrfelt.getText();
//        lengde = Integer.parseInt(lengdefelt.getText());
//        bonus = Double.parseDouble(bonusfelt.getText());
//      }
//      
//      catch (Exception e) {
//        failed = true;
//      }
//      if (!failed && type != null && !type.equals("") && regår != -1 && regnr != null && !regnr.equals("k") && lengde != -1 ) {
//            
//           BilForsikring b = new BilForsikring(lengde, null, lengde, regår, lengde, type, regnr, bonus);
//     
//        String t = lister.leggTilbilForsikring(b);
//        melding(t);
//         utskrift.append(lister.visbiltostring());
//      }
//      else {
//        utskrift.append("Forsikringen ble ikke opprettet,"
//                + "\nNoen felt har feil informasjon eller mangler\n");
//      }
//
//    }
//   
//   /**
//    * metode for å viser meldinger. Meldingene er viste med en java metode JOptionpane
//    * @param s 
//    */
//    private void melding(String s) {
//        JOptionPane.showMessageDialog(null, s, "Feil", JOptionPane.ERROR_MESSAGE);
//    }
//    
//    public void VisKunderegister(){
//        
//        String info = kundeliste.toString();
//        if(info == ""){
//            
//            utskrift.setText("Du har ikke register ennå");
//        }else{
//            utskrift.setText(info);
//        }
//        
//        utskrift.setCaretPosition(0);
//      
//    }
    
    
    
  
  public void slettFelter(){
  
     navnfelt.setText("");
     gateAdresse.setText("");
     kunderNrfelt1.setText("");
     KundeNrfelt3.setText("");
     kunderNrfelt2.setText("");
     Antall_kvadatmeterfelt.setText("");
     Antall_kvadatmeterfelt1.setText("");
     belopIfelf.setText("");
     belopIfelf.setText("");
     belopBfelt.setText("");
     belopBfelt1.setText("");
     boligenAdressfelt.setText("");
     boligenAdressfelt1.setText("");
     boligtypefelt.setText("");
     boligtypefelt1.setText("");
     modellfelt.setText("");
     modellfelt1.setText("");
     motorstyrkfelt.setText("");
     Baattypefelt.setText("");
     
 }
    
    
    
    
    

    
    
    
    /**
   * av Lunga majola s929577
   * register en person
   */
  public void leggTilKunde(){
      
  	  //if setningen som fanger felt og gir tilbak melding
      if(navnfelt.getText().equals("") || 
    		  gateAdresse.getText().equals("") || 
    		  postNummer.getText().equals("") || 
    		  gateNummer.getText().equals("")) {
    	  
          JOptionPane.showMessageDialog(null, "Du må fylle ut navnfelt og adressfelt");
          return;
      }
      
      String navn = navnfelt.getText();
      int age = Integer.parseInt(alder.getText());
      
      String gateAdr = gateAdresse.getText();
      String gateNr = gateNummer.getText();
      int postNr = Integer.parseInt(postNummer.getText());
      String byAdr = by.getText();
      String landAdr = land.getText();
      
      Adresse adr = new Adresse(gateAdr, gateNr, postNr, byAdr, landAdr);
      Kunde nyKunde = new Kunde(navn, adr, age);
      
      boolean success = this.kundeRegister.nyKunde(nyKunde);
      
      slettFelter();
      
      if(success){
    	  
          //melding("ok worked");
    	  utskrift.setText(this.kundeRegister.visKunde(nyKunde.getRegistreringsNummer()));
    	  
    	  int kNum = nyKunde.getRegistreringsNummer();

    	  Kundefeltk.setText(Integer.toString(kNum));
    	  KundeNrfelt3.setText(Integer.toString(kNum));
    	  kunderNrfelt1.setText(Integer.toString(kNum));
    	  KundeNrfeltb.setText(Integer.toString(kNum));
    	  kunderNrfelt2.setText(Integer.toString(kNum));
    	  utskrift.append(nyKunde.toString());
    	  
      }else{
    	  utskrift.setText("Det oppsto en feil mens vi prøvde å lagre kunden. Vennligst prøv igjen...");
      }    
  }
  
  
  public void leggTilbilForsikring(){
	  
     String pattern = "[A-Za-z]{3}[0-9]{3}";
     String regNummer = regnrfelt.getText();
     
     if (!(regNummer.toUpperCase().matches(pattern))) {
    	 JOptionPane.showMessageDialog( null, "Registreringsnummeret må \nbestå av 3 bokstaver og 3 tall\neks: CCC111","FEIL INPUT",JOptionPane.ERROR_MESSAGE);
    	 return;
     } 
     
     if (forsikringsRegister.finnBilForsikring(regNummer) != null) {
    	 JOptionPane.showMessageDialog(null, "En bil med samme registreringsnumer finnes fra før","FEIL INPUT",JOptionPane.ERROR_MESSAGE);
    	 return;
     } 
     
     if(!(modellfelt.getText().length()==0 || KundeNrfeltb.getText().length()== 0 || regnrfelt.getText().length() ==0)) {
        
        int year = Integer.parseInt(regarfelt.getText());
        double lengde = Double.parseDouble(lengdefelt.getText());
        int knr = Integer.parseInt(KundeNrfeltb.getText());
        String btingelser = betingelserFelt.getText();
        double beløp = Double.parseDouble(fBeløpFelt.getText());
        double premie = Double.parseDouble(årligPremierFelt.getText());
        
        Kunde k = this.kundeRegister.finnKunde(knr);
        
        if(k == null){
            utskrift.setText("fant ikke kunder i forsikring \n med KunderNummer: " + knr);
        }else{
        	
        	BilForsikring bf = new BilForsikring(k, Calendar.getInstance(), btingelser, premie, beløp, k);
        	bf.setRegistreringsNummer(regnrfelt.getText().toUpperCase());
            bf.setBilType((BilType)bilTypeCombo.getSelectedItem());
            bf.setModell(modellfelt.getText());
            bf.setRegistreringsÅr(year);
            bf.setPrisPerKilometer(Double.parseDouble(bilPrisPerKmfelt.getText()));
            bf.setBonus(bilBonusfelt.getText());
            bf.setKjøreLengde(lengde);
            
            this.forsikringsRegister.nyForsikring(bf);
            utskrift.setText(k.toString()+"\n“er registrert på "+ "\n" + bf.toString());
            
            slettFelter();
        }
    } 
    else{  
      JOptionPane.showMessageDialog(null,"Du må fylle inn all informasjon om bil for å registrere.","FEIL INPUT",JOptionPane.ERROR_MESSAGE);
    }
}
	  
	  
    /**
     * Method som lytter till og klarer method som gjor knapper till å 
     * virker
     */
    private class Lytter implements ActionListener{
       
        public void actionPerformed(ActionEvent e){
            
        	if (e.getSource() == regKunde) {
        		leggTilKunde();
        	} else if (e.getSource() == regbil) {
        		leggTilbilForsikring();
        	}
        	
        	
//            if (e.getSource() == regKunde)
//                leggTilKunde();
//             else if(e.getSource() == regbil)
//                 leggTilbilForsikring();
//                 //tegnBilForsikring();
        	
//               else if(e.getSource() == finnKunde)
//                   finnKunde();
//               else if(e.getSource()== Slettkunde)
//                   fjernKunde();
//               else if(e.getSource() == Reghus)
//                   leggTilHusoginnboForsikiring();
//               else if (e.getSource()==  regfrithus)
//                   leggTilFridsboligForsikiring();
//               else if(e.getSource() == SkrivUtReg)
//                   VisKunderegister();
//               else if(e.getSource() == regbaat)
//                   leggTilbaatForsikiring();  
    }
}
}
