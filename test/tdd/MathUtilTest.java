/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilTest {
    
    //day la class db, chua cac ham ma moi ham dung de test cac ham ben class
    // cua du an vi du test ham cF() coi chay dung ko
    // moi ham se chay 1 hoac nhieu lenh cF() tuy ban de kiem tra
    // khop mau xanh
    // ko khop mau do
    // moi ham se la 1 ham main() neu no mang phia truoc 1 ky hieu
    // @test - goi la annotation
    @Test
    public void testSuccessfulCase() {
        // ham nay goi la cF() ma tra ve ket qua giai thua
        // assertEquals(120, 720);
        
        // expect 1, atual : cho tinh toan chay ham
        assertEquals(1, khanh.util.MathUtil.computeFactorial(1));
        
        // expect 1, atual : cho tinh toan chay ham
        assertEquals(1, khanh.util.MathUtil.computeFactorial(0));
        
        assertEquals(720, khanh.util.MathUtil.computeFactorial(6));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFailCase() {
        // ham nay test nhung tinh huong ca chon
        // nguoi dung dua 5!, ko tinh duoc
        // ham cF() phai nem ve ngoai le, 1 tinh huong bat thuong, 1 exception
        // nhung exception ko phai la value de assert()
        // ta phai dung 1 chieu khac
        khanh.util.MathUtil.computeFactorial(-5); // ko sai assertEquals()
        
        // dua -5 vao tham so, minh (dev tk ra ham cF() coi day la ca chon)
        // dap vao mat ng dua con so -5 nay vao
        // bang cach nem ra ngoai le IllegalArgumentException
    }
    
}
// do: chi can 1 thang do, la coi nhu ca dam do, ham chay dung hau het
// cac cases, nhung chi 1 tinh huong sai, coi nhu ham sai
// xanh: tat ca phai xanh, ham y ham dung