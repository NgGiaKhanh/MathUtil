/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanh.util;

/**
 *
 * @author ASUS
 */
//đây là class chứa các hàm toán học ta tự viết, mục đích là ccoong cụ
//xài chung cho mọi nơi. Cái gì mà đc thiết kế để xài chung
//ta dùng kĩ thuật STATIC
public class MathUtil {

    //tính n! = 1, 2, 3, ...,n vì n! tăng rất nhanh, sẽ tràn int sớm
    //int chỉ lưu đc tối đa 2 tỷ 1 nên mình sài long an toàn hơn
    //15! to lắm rồi, tính tối đa 15!
    public static long computeFactorial(int n) {
        
        //nếu ng dùng cà chớn, ta sẽ ném ra ngoại lệ
        if(n < 0 || n > 15)
        {
            throw new IllegalArgumentException("Invalid argument, n must be >= 0 & n <= 15");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
