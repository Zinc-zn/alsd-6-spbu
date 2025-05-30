public class TransaksiLinkedList {
    NodeTransaksi head, tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void add(TransaksiPengisian input) {
        NodeTransaksi ndInput = new NodeTransaksi(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
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
