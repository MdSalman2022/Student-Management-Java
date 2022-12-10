import java.util.ArrayList;
import java.util.Scanner;

public class StudentData {

    public String SName;
    public String CGPA;

    ArrayList<String> studentId = new ArrayList<String>();
    ArrayList<String> studentName = new ArrayList<String>();
    ArrayList<String> studentCGPA = new ArrayList<String>();
    public void searchName(String id){

//        ArrayList of studentId

            studentId.add("211-15-4046");
            studentId.add("211-15-4048");
            studentId.add("212-15-4195");
            studentId.add("213-15-4263");
            studentId.add("213-15-4301");
            studentId.add("213-15-4331");
            studentId.add("213-15-4352");
            studentId.add("213-15-4360");
            studentId.add("213-15-4479");
            studentId.add("213-15-4485");
            studentId.add("213-15-4486");
            studentId.add("213-15-4489");
            studentId.add("213-15-4494");
            studentId.add("213-15-4495");
            studentId.add("213-15-4498");
            studentId.add("213-15-4499");
            studentId.add("213-15-4509");
            studentId.add("213-15-4510");
            studentId.add("213-15-4511");
            studentId.add("213-15-4512");
            studentId.add("213-15-4513");
            studentId.add("213-15-4514");
            studentId.add("213-15-4517");
            studentId.add("213-15-4519");
            studentId.add("213-15-4520");
            studentId.add("213-15-4523");
            studentId.add("213-15-4525");
            studentId.add("213-15-4548");
            studentId.add("213-15-4558");
            studentId.add("213-15-4562");
            studentId.add("213-15-4564");
            studentId.add("213-15-4575");
            studentId.add("213-15-4578");
            studentId.add("213-15-4579");
            studentId.add("213-15-4588");
            studentId.add("213-15-4589");
            studentId.add("213-15-4590");
            studentId.add("213-15-4591");
            studentId.add("213-15-4596");
            studentId.add("213-15-4598");
            studentId.add("213-15-4602");
            studentId.add("213-15-4604");
            studentId.add("213-15-4605");
            studentId.add("213-15-4607");
            studentId.add("213-15-4608");

//        ArrayList of studentName

            studentName.add("Md. Monem Shahriar");
            studentName.add("MD. MINAR HOSSAIN RABBI");
            studentName.add("Abu Naeem Sarker");
            studentName.add("Shazidul Islam Shoraim");
            studentName.add("Adil Ar Rafy");
            studentName.add("Asif Ahmed");
            studentName.add("Md. Raiyan Sifat");
            studentName.add("Sanzida Islam Syma");
            studentName.add("Ashab Rahman");
            studentName.add("ASMA SAYDA FARHA");
            studentName.add("MD ADNAN RAHIM");
            studentName.add("MD Saidur Rahaman");
            studentName.add("AFROZA KHANOM LIMA");
            studentName.add("MARIA MAHMOOD");
            studentName.add("Sazal Das");
            studentName.add("Md. Sakib Arman Santo");
            studentName.add("BILLAL HOSSAIN SHAWON");
            studentName.add("Md. Rejawl");
            studentName.add("Maharabul Islam");
            studentName.add("MD. MEZBAUL HAQUE");
            studentName.add("Rima Akter");
            studentName.add("FARJANA NASRIN");
            studentName.add("RIHAN JAMIL RAHAT");
            studentName.add("NURJAHAN MIM");
            studentName.add("Azmain Anzum Chowdhury");
            studentName.add("Mehedi Hasan Salman");
            studentName.add("SAJID MAHAMOOD");
            studentName.add("MOHAMMAD ASIF DEWAN");
            studentName.add("RAYHAN SHAHRIAR RIFAT");
            studentName.add("TANZIM AHMED");
            studentName.add("MD. FAISAL TAJWAR");
            studentName.add("Md. Najmus Sakib Nahid");
            studentName.add("Md. Julkar Naeen");
            studentName.add("UMMAY MAHJABEEN");
            studentName.add("Sourav Kumar Das");
            studentName.add("Shahriar Hossain");
            studentName.add("TABIB-E- ALAHI");
            studentName.add("Md. Shahin Akter");
            studentName.add("NAHIUN TASNIM KHAN");
            studentName.add("Supta Das Dip");
            studentName.add("RASHEDUL ISLAM");
            studentName.add("ASIF KARIM BIPLOB");
            studentName.add("Md. Tamim Hossain");
            studentName.add("SAKIB ALAM JISAN");
            studentName.add("Md. Istiak Rahman");

//        ArrayList of studentCGPA

            studentCGPA.add("3.00");
            studentCGPA.add("3.20");
            studentCGPA.add("2.7");
            studentCGPA.add("3.10");
            studentCGPA.add("3.20");
            studentCGPA.add("3.30");
            studentCGPA.add("3.40");
            studentCGPA.add("3.50");
            studentCGPA.add("3.60");
            studentCGPA.add("3.70");
            studentCGPA.add("3.78");
            studentCGPA.add("3.78");
            studentCGPA.add("3.11");
            studentCGPA.add("3.12");
            studentCGPA.add("3.13");
            studentCGPA.add("3.14");
            studentCGPA.add("3.15");
            studentCGPA.add("3.16");
            studentCGPA.add("3.17");
            studentCGPA.add("3.18");
            studentCGPA.add("3.19");
            studentCGPA.add("3.21");
            studentCGPA.add("3.22");
            studentCGPA.add("3.23");
            studentCGPA.add("3.24");
            studentCGPA.add("3.83");
            studentCGPA.add("3.26");
            studentCGPA.add("3.79");
            studentCGPA.add("3.28");
            studentCGPA.add("3.29");
            studentCGPA.add("3.31");
            studentCGPA.add("3.32");
            studentCGPA.add("3.33");
            studentCGPA.add("3.34");
            studentCGPA.add("3.80");
            studentCGPA.add("3.36");
            studentCGPA.add("3.82");
            studentCGPA.add("3.38");
            studentCGPA.add("3.39");
            studentCGPA.add("3.41");
            studentCGPA.add("3.42");
            studentCGPA.add("3.43");
            studentCGPA.add("3.44");
            studentCGPA.add("3.45");
            studentCGPA.add("3.46");

//        System.out.println(id);
        for (int i = 0; i < studentId.size(); i++) {
//            System.out.println(studentId.get(i));
            if(studentId.contains(id)){
                SName = studentName.get(studentId.indexOf(id));
                CGPA = studentCGPA.get(studentId.indexOf(id));
                break;
            }
        }
    }

}
