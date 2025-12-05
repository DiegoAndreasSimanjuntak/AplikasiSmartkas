
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SimpanService {

    public static void exportCSV(
            JTable table,
            String totalPemasukan,
            String totalPengeluaran,
            String totalSisa,
            java.io.File saveLocation
    ) throws Exception {

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        if (model.getRowCount() == 0) {
            throw new Exception("Tidak ada data untuk diexport!");
        }

        // Tambahkan ekstensi CSV bila belum ada
        if (!saveLocation.getAbsolutePath().toLowerCase().endsWith(".csv")) {
            saveLocation = new java.io.File(saveLocation.getAbsolutePath() + ".csv");
        }

        try (FileWriter fw = new FileWriter(saveLocation)) {

            // Header kolom
            for (int i = 0; i < model.getColumnCount(); i++) {
                fw.write(model.getColumnName(i));
                if (i < model.getColumnCount() - 1) fw.write(",");
            }
            fw.write("\n");

            // Data per baris
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    fw.write(String.valueOf(model.getValueAt(i, j)));
                    if (j < model.getColumnCount() - 1) fw.write(",");
                }
                fw.write("\n");
            }

            // Tambahkan summary
            fw.write("\nTotal Pemasukan:," + totalPemasukan);
            fw.write("\nTotal Pengeluaran:," + totalPengeluaran);
            fw.write("\nSisa Uang:," + totalSisa);

            fw.flush();
        }
    }
}
