/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rllun
 */
public class ProdutoTableModel extends AbstractTableModel {

    private List<Produto> dados = new ArrayList<>();
    private String[] colunas = {"Descriçao", "QTD", "Valor"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        switch (coluna) {
            case 0:
                return dados.get(linha).getDescricao();
            case 1:
                return dados.get(linha).getQtd();
            case 2:
                return dados.get(linha).getValor();

        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
        switch (coluna) {
            case 0:
                 dados.get(linha).setDescricao((String) valor);
                 break;
            case 1:
                 dados.get(linha).setQtd(Integer.parseInt((String) valor));
                 break;
            case 2:
                 dados.get(linha).setValor(Double.parseDouble((String)valor));
                 break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    
    
    public void addRow(Produto p){
        this.dados.add(p);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
}
