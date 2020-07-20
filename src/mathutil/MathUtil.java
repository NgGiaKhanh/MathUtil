/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static khanh.util.MathUtil.computeFactorial;

/**
 *
 * @author ASUS
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + computeFactorial(5));
        // tôi muốn biết 5! chạy đúng ko
        // vậy tôi in kết quả xử lí của hàm ra (actulal value)
        // tôi so sánh nó coi có = 120 mà tôi tính trước ko(expected value)
        // nếu hàm có 1 value tra ve (actual - gia su 120)
        // va khop voi cai tui can no phai the(expected - gia su minh can ham tra ve 120)
        // tra ve 120
        // actual khop voi expected, ham chay nhu mong doi, ham chay dung
        // testing chang qua la chay app, chay ham, xem ket qua tra ve co dung nhu mong doi hay ko
        // actual va expected la nhu nhau
        // neu ko khop, code co bug hoac mnh ky vong sai
        
        // expected 1
        System.out.println("1! = " + computeFactorial(1));
        
         // expected 1
        System.out.println("0! = " + computeFactorial(0));
        
        // cach test kieu nay  phai:
        // > chuan data dau vao
        // > tinh truoc ket qua tra ve (expected)
        // > so sanh ket qua tra ve tu ham (actual) voi expected = mat
        // tu dua ra ket luan -> luan ham = mat
        
        // expected: exception
        System.out.println("-5! = " + computeFactorial(-5));
        
        //ki thuat dung mat doi chieu ket qua on NHUNG KO HIEU QUA
        //ki thuat co the doi chieu ket qua duoc luon ma, may so duoc expected va actual
        // GIANG HO DUA RA 1 BO THU VIEN, 1 FRAMEWORK GIUP MINH
        // TU DONG SO SANH 2 KET QUA expected va actual
        // FRAMEWORK nay se tu dong so sanh va dua ra mau sac de ham y rang
        // ham chay dung ma xanh
        // ham chay sai, ko nhu ky vong mau do
        // ap dung cho 1 loat data dau vao
    }

}
