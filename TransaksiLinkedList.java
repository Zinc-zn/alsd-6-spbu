public class TransaksiLinkedList {
    NodeTransaksi head, tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void add(TransaksiPengisian input) {
        NodeTransaksi ndInput = new NodeTransaksi(input, null);
        if (isEmpty()) { // jika masih kosong akan tetap jadi yang terdepan tidak peduli vip atau bukan
            head = ndInput;
            tail = ndInput;
        } else {
            if (input.kendaraan.isVIP) { // cek apakah vip, jika iya add first
                ndInput.next = head;
                head = ndInput;
            } else { // jika bukan vip add last
                tail.next = ndInput;
                tail = ndInput;
            }
        }
    }

    public void riwayatTransaksi() {
        if (!isEmpty()) {
            NodeTransaksi tmp = head;
            System.out.println("Isi linked list:");
            while (tmp != null) {
                tmp.data.tampil();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list masih kosong");
        }
    }
}
