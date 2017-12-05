/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Admine;

/**
 *
 * @author sabrine
 */
public class AdminService extends AbstractFacade<Admine>{
     
    public int seConnecter(Admine admin){
        Admine loadedAdmin = find(admin.getId());
        if (loadedAdmin==null){
            return -1;
        }else if(!loadedAdmin.getPassword().equals(admin.getPassword())){
            return -2;
        }else {
            return 1;
        }
    }
    
    public AdminService() {
        super(Admine.class);
    }
    
    
}
