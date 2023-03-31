/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phongtt
 */
public class AccountRamRepository implements IAccountRepository {

    private static final List<Account> accounts = new ArrayList<Account>();
    static {
        accounts.add(new Account("phongtt12", "123456", RoleConst.QUAN_LY));
        accounts.add(new Account("phongtt35", "12", RoleConst.THU_KHO));
    }
    
    @Override
    public List<Account> findAll() {
        return accounts;
    }

    @Override
    public Account findByUsername(String username) {
        // Cách 1
//        for(Account account : accounts) {
//            if (account.getUsername().equalsIgnoreCase(username)) {
//                return account;
//            }
//        }
//        return null;
        
        
        // Cách 2
        return accounts.stream() // Đổi sang stream
                .filter(account -> // account là phần từ đại diện duyệt danh sách
                        account.getUsername() // lấy tên tài khoản
                                .equalsIgnoreCase(username)) // so sánh với giá trị truyền vào
                .findFirst() // Lấy kết quả đầu tiên tìm được
                .orElse(null); // Không tìm được thì trả về NULL;
    }
    
}
