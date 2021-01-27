package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class ParkirGUI {
    JFrame parkir = new JFrame();
    JLabel top,input,view,delete,nonota,cetaknota,jenisL,platL,hps,cetak,ctk,
            tglkeluarL,blnkeluarL,jamkeluarL,menitkeluarL,tahunkeluarL;
    JTextField jenis,plat,idxhps,idxctk,idxnota,tglkeluar,blnkeluar,
            jamkeluar,menitkeluar,tahunkeluar;
    JRadioButton perjam,perhari;
    JButton reg,dlt,cetk,exit,change,lihatdata,insert,clear;
    JTextArea area = new JTextArea();
    JScrollPane areascroll;
    JButton perjamB,perhariB;
    private boolean cek;
    private int nonotajam,nonotahari,loopjam,loophari,cekctk,harga1,harga2,harga3,totalH,cb;
    private int durasijam,durasimenit,jammasuk,menitmasuk,durasihari,durasibulan,durasitahun;
    private boolean jumlahH=false,jumlahJ=false;
    private String parkirJ="",parkirH="";
    
    public ParkirGUI(){
        parkir.setSize(1100, 630);
        parkir.setLayout(null);
        parkir.getContentPane().setBackground(Color.PINK);
        
        perjamB = new JButton("Parkir Perjam");
        perjamB.setBounds(10, 200, 150, 30);
        perjamB.setBackground(Color.YELLOW);
        parkir.add(perjamB);
        
        perhariB = new JButton("Parkir Perhari");
        perhariB.setBounds(10, 250, 150, 30);
        perhariB.setBackground(Color.GREEN);
        parkir.add(perhariB);
        
        tglkeluarL= new JLabel ("Tanggal Keluar");
        tglkeluarL.setBounds(850, 70, 200, 30);
        tglkeluarL.setFont(new Font("Times New Roman",Font.BOLD,15));
        parkir.add(tglkeluarL);
        
        tglkeluar= new JTextField();
        tglkeluar.setEditable(false);
        tglkeluar.setBounds(970, 70, 100, 30);
        parkir.add(tglkeluar);
        
        blnkeluarL= new JLabel ("Bulan Keluar");
        blnkeluarL.setBounds(850, 110, 200, 30);
        blnkeluarL.setFont(new Font("Times New Roman",Font.BOLD,15));
        parkir.add(blnkeluarL);
        
        blnkeluar= new JTextField();
        blnkeluar.setEditable(false);
        blnkeluar.setBounds(970, 110, 100, 30);
        parkir.add(blnkeluar);
        
        tahunkeluarL= new JLabel ("Tahun Keluar");
        tahunkeluarL.setBounds(850, 150, 200, 30);
        tahunkeluarL.setFont(new Font("Times New Roman",Font.BOLD,15));
        parkir.add(tahunkeluarL);
        
        tahunkeluar= new JTextField();
        tahunkeluar.setEditable(false);
        tahunkeluar.setBounds(970, 150, 100, 30);
        parkir.add(tahunkeluar);
        
        jamkeluarL= new JLabel ("Jam Keluar");
        jamkeluarL.setBounds(850, 190, 200, 30);
        jamkeluarL.setFont(new Font("Times New Roman",Font.BOLD,15));
        parkir.add(jamkeluarL);
        
        jamkeluar= new JTextField();
        jamkeluar.setEditable(false);
        jamkeluar.setBounds(970, 190, 100, 30);
        parkir.add(jamkeluar);
        
        menitkeluarL= new JLabel ("Menit Keluar");
        menitkeluarL.setBounds(850, 230, 200, 30);
        menitkeluarL.setFont(new Font("Times New Roman",Font.BOLD,15));
        parkir.add(menitkeluarL);
        
        menitkeluar= new JTextField(); 
        menitkeluar.setEditable(false);
        menitkeluar.setBounds(970, 230, 100, 30);
        parkir.add(menitkeluar);
        
        cetk = new JButton("CETAK");
        cetk.setBounds(900, 270, 100, 30);
        cetk.setEnabled(false);
        parkir.add(cetk);
        
        top = new JLabel ("Program Sistem Informasi Parkir");
        top.setBounds(260, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        parkir.add(top);
        
        areascroll=new JScrollPane(area);
        areascroll.setBounds(170, 100, 300,330);
        area.setEditable(false);
        parkir.add(areascroll);
        
        input = new JLabel ("Input");
        input.setBounds(490, 90, 100, 30);
        input.setFont(new Font("Times New Roman",Font.BOLD,20));
        parkir.add(input);
        
        jenisL = new JLabel ("Jenis kendaraan");
        jenisL.setBounds(500, 120, 100, 30);
        parkir.add(jenisL);
        
        jenis = new JTextField();
        jenis.setBounds(500, 150, 100, 30);
        jenis.setEditable(false);
        parkir.add(jenis);
        
        platL = new JLabel ("Plat kendaraan");
        platL.setBounds(500, 180, 100, 30);
        parkir.add(platL);
        
        plat = new JTextField();
        plat.setBounds(500, 210, 100, 30);
        plat.setEditable(false);
        parkir.add(plat);
        
        reg = new JButton("daftar");
        reg.setBounds(500, 250, 80, 30);
        reg.setEnabled(false);
        parkir.add(reg);
        
        delete = new JLabel ("Delete");
        delete.setBounds(630, 295, 100, 30);
        delete.setFont(new Font("Times New Roman",Font.BOLD,20));
        parkir.add(delete);
        
        hps = new JLabel ("Index yang dihapus");
        hps.setBounds(640, 325, 200, 30);
        parkir.add(hps);
        
        idxhps = new JTextField();
        idxhps.setBounds(640, 355, 100, 30);
        idxhps.setEditable(false);
        parkir.add(idxhps);
        
        dlt = new JButton("Delete");
        dlt.setBounds(640, 390, 80, 30);
        dlt.setEnabled(false);
        parkir.add(dlt);
        
        cetak = new JLabel ("Cetak");
        cetak.setBounds(630, 90, 100, 30);
        cetak.setFont(new Font("Times New Roman",Font.BOLD,20));
        parkir.add(cetak);
        
        ctk = new JLabel ("Index yang dicetak");
        ctk.setBounds(640, 120, 200, 30);
        parkir.add(ctk);
        
        idxctk = new JTextField();
        idxctk.setBounds(640, 150, 100, 30);
        idxctk.setEditable(false);
        parkir.add(idxctk);
        
        nonota = new JLabel("Nonota yang dicetak");
        nonota.setBounds(640, 180, 200, 30);
        parkir.add(nonota);
        
        idxnota = new JTextField();
        idxnota.setEditable(false);
        idxnota.setBounds(640, 210, 100, 30);
        parkir.add(idxnota);
        
        insert = new JButton("INSERT");
        insert.setBounds(640, 250, 80, 30);
        insert.setEnabled(false);
        parkir.add(insert);
        
        lihatdata = new JButton("Lihat Data");
        lihatdata.setBounds(490, 330, 100, 30);
        lihatdata.setEnabled(false);
        parkir.add(lihatdata);
        
        exit = new JButton("EXIT");
        exit.setBounds(970, 550, 90, 30);
        exit.setBackground(Color.CYAN);
        parkir.add(exit);
        
        change = new JButton("CHANGE");
        change.setBounds(20, 550, 90, 30);
        change.setBackground(Color.red);
        parkir.add(change);
        
        clear = new JButton("CLEAR");
        clear.setBounds(550, 550, 90, 30);
        clear.setBackground(Color.GREEN);
        parkir.add(clear);
                
        parkir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        parkir.setVisible(true);
        parkir.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(null,"Silahkan pilih ingin menginputkan data parkir perjam atau perhari terlebih dahulu");
        
        perjamB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                cb = 1;
                AllObjectController.nota.setMenu(cb);
                jenis.setEditable(true);
                reg.setEnabled(true);
                plat.setEditable(true);
                perjamB.setEnabled(false);
                perhariB.setEnabled(false);
                lihatdata.setEnabled(true);
                JOptionPane.showMessageDialog(null,"Anda akan mengisi data parkir perjam", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        perhariB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                cb = 2;
                AllObjectController.nota.setMenu(cb);
                jenis.setEditable(true);
                reg.setEnabled(true);
                plat.setEditable(true);
                lihatdata.setEnabled(true);
                perjamB.setEnabled(false);
                perhariB.setEnabled(false);
                JOptionPane.showMessageDialog(null,"Anda akan mengisi data parkir perhari", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        reg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    if(AllObjectController.nota.getMenu()==1){
                        String jeniskendaraan = jenis.getText();
                        String platnomor = plat.getText();
                        nonotajam++;
                        if(nonotahari>=1){
                            if(jumlahJ==false){
                                nonotajam=nonotahari+1;
                                jumlahJ = true;
                            }
                            else if(jumlahJ==true){
                                nonotajam=nonotajam++;
                            }
                        }
                        jumlahH=false;
                        AllObjectController.kendaraan.insert(platnomor, jeniskendaraan, "parkir");
                        DateFormat formatHmasuk = new SimpleDateFormat("HH");
                        DateFormat formatMmasuk = new SimpleDateFormat("mm");
                        Date getjammasuk = new Date();
                        Date getmenitmasuk = new Date(); 
                        String jammasuk = formatHmasuk.format(getjammasuk);
                        String menitmasuk = formatMmasuk.format(getmenitmasuk);
                        AllObjectController.nota.insertNotaJam(0,nonotajam,"parkir",new Date(),jammasuk,menitmasuk,0,0);
                        JOptionPane.showMessageDialog(null,"Berhasil menginputkan data", "Information", JOptionPane.INFORMATION_MESSAGE);
                        loopjam++;
                    }
                    else if(AllObjectController.nota.getMenu()==2){
                        String jeniskendaraan = jenis.getText();
                        String platnomor = plat.getText();
                        nonotahari++;
                        if(nonotajam>=1){
                            if(jumlahH==false){
                                nonotahari=nonotajam+1;
                                jumlahH = true;
                            }
                            else if(true==jumlahH){
                                nonotahari=nonotahari++;
                            }
                        }
                        jumlahJ=false;
                        AllObjectController.kendaraan.insert(platnomor, jeniskendaraan, "parkir");
                        DateFormat formatTmasuk = new SimpleDateFormat("dd");
                        DateFormat formatBmasuk = new SimpleDateFormat("MM");
                        DateFormat formatTHmasuk = new SimpleDateFormat ("yyyy");
                        Date gettanggalmasuk = new Date();
                        Date getbulanmasuk = new Date();
                        Date gettahunmasuk = new Date();
                        String tanggalmasuk = formatTmasuk.format(gettanggalmasuk);
                        String bulanmasuk = formatBmasuk.format(getbulanmasuk);
                        String tahunmasuk = formatTHmasuk.format(gettahunmasuk);
                        AllObjectController.nota.insertNotaHari(tanggalmasuk,bulanmasuk,tahunmasuk,0,0,0,"parkir",0,nonotahari);
                        JOptionPane.showMessageDialog(null,"Berhasil menginputkan data", "Information", JOptionPane.INFORMATION_MESSAGE);
                        loophari++;
                        
                    }
                    kosong();
                    idxhps.setEditable(true);
                    dlt.setEnabled(true);
                    idxctk.setEditable(true);
                    insert.setEnabled(true);
                    idxnota.setEditable(true);
                }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"Format Pengisian salah", "Information", JOptionPane.INFORMATION_MESSAGE);  
                }
            }
        });
        
        lihatdata.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                lihatdata.setEnabled(false);
                view();
                if(AllObjectController.nota.getMenu()==1){ 
                    if(loopjam==0){
                        JOptionPane.showMessageDialog(null,"Data kosong", "Information", JOptionPane.INFORMATION_MESSAGE);  
                    }
                    else if(loopjam>0){
                        area.setText(parkirJ);
                    }
                }
                else if(AllObjectController.nota.getMenu()==2){
                    if(loophari==0){
                        JOptionPane.showMessageDialog(null,"Data kosong", "Information", JOptionPane.INFORMATION_MESSAGE);  
                    }
                    else if(loophari >0){
                        area.setText(parkirH);
                    }
                }
            }
        });
        
        dlt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                int idx = Integer.parseInt(idxhps.getText());
                if(AllObjectController.nota.getMenu()==1){ 
                    if(loopjam==0){
                        JOptionPane.showMessageDialog(null,"Data kosong", "Information", JOptionPane.INFORMATION_MESSAGE);  
                    }
                    else{
                        AllObjectController.nota.deleteNotaJam(idx);
                        loopjam--;
                        JOptionPane.showMessageDialog(null,"Data berhasil dihapus", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                else if(AllObjectController.nota.getMenu()==2){
                    if(loophari==0){
                        JOptionPane.showMessageDialog(null,"Data kosong", "Information", JOptionPane.INFORMATION_MESSAGE);  
                    }
                    else{
                        AllObjectController.nota.deleteNotaHari(idx);
                        loophari--;
                        JOptionPane.showMessageDialog(null,"Data berhasil dihapus", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    kosong();
                } 
            }
        });
        
        insert.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                    if(AllObjectController.nota.getMenu()==1){ 
                        jamkeluar.setEditable(true);
                        menitkeluar.setEditable(true);
                        cetk.setEnabled(true);
                    }
                    else if(AllObjectController.nota.getMenu()==2){
                        tglkeluar.setEditable(true);
                        blnkeluar.setEditable(true);
                        tahunkeluar.setEditable(true);
                        cetk.setEnabled(true);
                    }
            }
        });
        
        cetk.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                cekctk = Integer.parseInt(idxctk.getText());
                int notaC = Integer.parseInt(idxnota.getText());
                AllObjectController.kendaraan.showData(notaC-1).setKondisi("sudah keluar");           
                if(AllObjectController.nota.getMenu()==1){ 
                    int jmklr=Integer.parseInt(jamkeluar.getText());
                    int mntklr=Integer.parseInt(menitkeluar.getText());
                    AllObjectController.nota.showDataNotajam(cekctk).setJamKeluar(jmklr);
                    AllObjectController.nota.showDataNotajam(cekctk).setMenitKeluar(mntklr);    
                    jammasuk = Integer.parseInt(AllObjectController.nota.showDataNotajam(cekctk).getJamMasuk());
                    menitmasuk = Integer.parseInt(AllObjectController.nota.showDataNotajam(cekctk).getMenitMasuk());
                    durasijam = AllObjectController.nota.showDataNotajam(cekctk).getJamKeluar() - jammasuk;
                    durasimenit = AllObjectController.nota.showDataNotajam(cekctk).getMenitKeluar() - menitmasuk;
                    if ("mobil".equals(AllObjectController.kendaraan.showData(cekctk).getJenisKendaraan())){
                        harga1 = durasijam*5000;
                        harga2 = durasimenit*100;
                        totalH = harga1 + harga2;
                    }
                    else if ("motor".equals(AllObjectController.kendaraan.showData(cekctk).getJenisKendaraan())){
                        harga1 = durasijam*2000;
                        harga2 = durasimenit*50;
                        totalH = harga1 + harga2;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"PILIHAN KENDARAAN SALAH", "Information", JOptionPane.INFORMATION_MESSAGE); 
                    }
                    area.setText(parkirjam(cekctk,notaC));
                }
                else if(AllObjectController.nota.getMenu()==2){
                    int tglklr= Integer.parseInt(tglkeluar.getText());                     
                    int blnklr=Integer.parseInt(blnkeluar.getText());
                    int thnklr=Integer.parseInt(tahunkeluar.getText());
                    AllObjectController.nota.showDataNotaHari(cekctk).setTanggalKeluar(tglklr);
                    AllObjectController.nota.showDataNotaHari(cekctk).setBulanKeluar(blnklr);
                    AllObjectController.nota.showDataNotaHari(cekctk).setTahunKeluar(thnklr);
                    int tanggalmasuk = Integer.parseInt(AllObjectController.nota.showDataNotaHari(cekctk).getTanggalMasuk());
                    int bulanmasuk = Integer.parseInt(AllObjectController.nota.showDataNotaHari(cekctk).getBulanMasuk());
                    int tahunmasuk = Integer.parseInt(AllObjectController.nota.showDataNotaHari(cekctk).getTahunMasuk());
                    durasihari = AllObjectController.nota.showDataNotaHari(cekctk).getTanggalKeluar() - tanggalmasuk;
                    durasibulan = AllObjectController.nota.showDataNotaHari(cekctk).getBulanKeluar() - bulanmasuk;
                    durasitahun = AllObjectController.nota.showDataNotaHari(cekctk).getTahunKeluar() - tahunmasuk;
                    if ("mobil".equals(AllObjectController.kendaraan.showData(cekctk).getJenisKendaraan())){
                        harga1 = durasihari*50000;
                        harga2 = durasibulan*500000;
                        harga3 = durasitahun*5000000;
                        totalH = harga1 + harga2 + harga3;
                    }
                    else if ("motor".equals(AllObjectController.kendaraan.showData(cekctk).getJenisKendaraan())){
                        harga1 = durasihari*30000;
                        harga2 = durasibulan*300000;
                        harga3 = durasitahun*3000000;
                        totalH = harga1 + harga2 + harga3;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"PILIHAN KENDARAAN SALAH", "Information", JOptionPane.INFORMATION_MESSAGE); 
                    }
                    area.setText(parkirhari(cekctk,notaC));  
                }
                kosong();
            }
        });
        
        change.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                perjamB.setEnabled(true);
                perhariB.setEnabled(true);
                cetk.setEnabled(false);
                jenis.setEditable(false);
                reg.setEnabled(false);
                plat.setEditable(false);
                idxhps.setEditable(false);
                dlt.setEnabled(false);
                idxctk.setEditable(false);
                insert.setEnabled(false);
                lihatdata.setEnabled(false);
                jamkeluar.setEditable(false);
                menitkeluar.setEditable(false);
                tglkeluar.setEditable(false);
                blnkeluar.setEditable(false);
                tahunkeluar.setEditable(false);
                idxnota.setEditable(false);
                area.setText("");
            }
        });
        
        clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                area.setText("");
                parkirJ="";
                parkirH="";
                lihatdata.setEnabled(true);
            }
        });
        
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                parkir.dispose();
            }
        });
    }
    
    String parkirjam(int i,int nota){
        String CparkirJ = "====BANDAR UDARA JUANDA SURABAYA===="+ 
                         "\nJenis kendaraan\t= "+AllObjectController.kendaraan.showData(nota-1).getJenisKendaraan()+
                         "\nPlat nomor\t\t= "+AllObjectController.kendaraan.showData(nota-1).getPlatNomor()+            
                         "\nTanggal parkir\t\t= "+new SimpleDateFormat("dd-MM-yyyy").format(AllObjectController.nota.showDataNotajam(i).getTanggalMasuk())+
                         "\nWaktu masuk\t\t= "+AllObjectController.nota.showDataNotajam(i).getJamMasuk() + " : " + AllObjectController.nota.showDataNotajam(i).getMenitMasuk() + " WIB"+
                         "\nWaktu keluar\t\t= " +AllObjectController.nota.showDataNotajam(i).getJamKeluar() + " : " + AllObjectController.nota.showDataNotajam(i).getMenitKeluar() + " WIB"+   
                         "\nDurasi parkir\t\t= "+durasijam +" : " +durasimenit+
                         "\nHarga parkir\t\t= "+totalH;
        return CparkirJ;
    }
    
    String parkirhari(int i,int nota){
        String CparkirH ="====BANDAR UDARA JUANDA SURABAYA===="+  
                         "\nJenis kendaraan\t= "+AllObjectController.kendaraan.showData(AllObjectController.nota.showDataNotaHari(i).getNoNota()-1).getJenisKendaraan()+
                         "\nPlat nomor\t\t= "+AllObjectController.kendaraan.showData(AllObjectController.nota.showDataNotaHari(i).getNoNota()-1).getPlatNomor()+
                         "\nTanggal parkir\t\t= "+AllObjectController.nota.showDataNotaHari(i).getTanggalMasuk()+"/"+AllObjectController.nota.showDataNotaHari(i).getBulanMasuk()+"/"+AllObjectController.nota.showDataNotaHari(i).getTahunMasuk()+
                         "\nTanggal keluar\t\t= " +AllObjectController.nota.showDataNotaHari(i).getTanggalKeluar()+"/"+AllObjectController.nota.showDataNotaHari(i).getBulanKeluar()+"/"+AllObjectController.nota.showDataNotaHari(i).getTahunKeluar()+
                         "\nDurasi parkir\t\t= "+durasihari +" / " +durasibulan+"/"+durasitahun+
                         "\nHarga parkir\t\t= "+totalH;
        return CparkirH;
    }
    
    public void view(){
        for(int i=0;i<loopjam;i++){
            parkirJ+= "\n\nindex = "+i+
                      "\nNo nota= "+AllObjectController.nota.showDataNotajam(i).getNoNota()+
                      "\nKondisi kendaraan\t= "+AllObjectController.kendaraan.showData(AllObjectController.nota.showDataNotajam(i).getNoNota()-1).getKondisi()+
                      "\nJenis kendaraan\t= "+AllObjectController.kendaraan.showData(AllObjectController.nota.showDataNotajam(i).getNoNota()-1).getJenisKendaraan()+
                      "\nPlat nomor\t\t= "+AllObjectController.kendaraan.showData(AllObjectController.nota.showDataNotajam(i).getNoNota()-1).getPlatNomor()+            
                      "\nTanggal parkir\t\t= "+new SimpleDateFormat("dd-MM-yyyy").format(AllObjectController.nota.showDataNotajam(i).getTanggalMasuk())+
                      "\nWaktu masuk\t\t= "+AllObjectController.nota.showDataNotajam(i).getJamMasuk() + " : " + AllObjectController.nota.showDataNotajam(i).getMenitMasuk() + " WIB"+
                      "\nWaktu keluar\t\t= " +AllObjectController.nota.showDataNotajam(i).getJamKeluar() + " : " + AllObjectController.nota.showDataNotajam(i).getMenitKeluar() + " WIB"; 
        }
        
        for(int i=0;i<loophari;i++){
            parkirH += "\n\nindex = "+i+"\nNo nota= "+AllObjectController.nota.showDataNotaHari(i).getNoNota()+
                       "\nKondisi kendaraan\t= "+AllObjectController.kendaraan.showData(AllObjectController.nota.showDataNotaHari(i).getNoNota()-1).getKondisi()+    
                       "\nJenis kendaraan\t= "+AllObjectController.kendaraan.showData(AllObjectController.nota.showDataNotaHari(i).getNoNota()-1).getJenisKendaraan()+
                       "\nPlat nomor\t\t= "+AllObjectController.kendaraan.showData(AllObjectController.nota.showDataNotaHari(i).getNoNota()-1).getPlatNomor()+
                       "\nTanggal parkir\t\t= "+AllObjectController.nota.showDataNotaHari(i).getTanggalMasuk()+"/"+AllObjectController.nota.showDataNotaHari(i).getBulanMasuk()+"/"+AllObjectController.nota.showDataNotaHari(i).getTahunMasuk()+
                       "\nTanggal keluar\t\t= " +AllObjectController.nota.showDataNotaHari(i).getTanggalKeluar()+"/"+AllObjectController.nota.showDataNotaHari(i).getBulanKeluar()+"/"+AllObjectController.nota.showDataNotaHari(i).getTahunKeluar();
            }
    }
    
    public void kosong(){
        jenis.setText(null);
        plat.setText(null);
        idxhps.setText(null);
        idxctk.setText(null);
        tglkeluar.setText(null);
        blnkeluar.setText(null);
        jamkeluar.setText(null);
        menitkeluar.setText(null);
        tahunkeluar.setText(null);
    }
}