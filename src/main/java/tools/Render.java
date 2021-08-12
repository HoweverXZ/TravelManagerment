package tools;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class Render extends JTextArea implements TableCellRenderer {
    public Render() {
        //将表格设为自动换行
        setWrapStyleWord(true);
        setLineWrap(true); //利用JTextArea的自动换行方法
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus, int row, int column) {
        // 计算当下行的最佳高度
        int maxPreferredHeight = 0;
        for (int i = 0; i < table.getColumnCount(); i++) {
            setText("" + table.getValueAt(row, i));
            setSize(table.getColumnModel().getColumn(column).getWidth(), 0);
            maxPreferredHeight = Math.max(maxPreferredHeight, getPreferredSize().height);
        }

        if (table.getRowHeight(row) != maxPreferredHeight) {  // 少了这行则处理器瞎忙
            table.setRowHeight(row, maxPreferredHeight);
        }
        setText(value == null ? "" : value.toString());
        return this;
    }
}

