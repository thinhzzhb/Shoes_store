/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.services;

import com.models.DanhMucSP;
import com.viewModel.Objecttt;
import java.util.List;

/**
 *
 * @author user
 */
public interface IDanhMucSPService {
    List<DanhMucSP> getAll();

    String Add(Objecttt x);

    String Update(Objecttt x, int id);

    String Delete(int id);

    DanhMucSP getbyid(int id);
    
}