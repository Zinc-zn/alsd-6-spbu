public class AntrianKendaraan {
    Kendaraan[] queue;
    int front;
    int rear;
    int size;
    int capacity;

    public AntrianKendaraan(int capacity) {
        this.capacity = capacity;
        this.queue = new Kendaraan[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void tambahKendaraan(Kendaraan k) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah kendaraan.");
            return;
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = k;
            size++;
            System.out.println("Kendaraan masuk ke dalam antrian.");
        }
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        } else {
            System.out.println("Antrian Kendaraan:");

            int index = front;
            for (int i = 0; i < size; i++) {
                queue[index].tampil();
                index = (index + 1) % capacity;
            }
        }

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void tampilJumlahAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
            return;
        } else {
            int jumlah = rear - front + 1;
            System.out.println(">> Jumlah Kendaraan di Antrian: " + jumlah);
        }
    }

    public Kendaraan layaniKendaraan() {
        if (isEmpty()) {
            System.out.println("antrian masih kosong");
            return null;
        } else {
            Kendaraan dt = queue[front];
            front = (front + 1) % capacity;
            size--;
            return dt;
        }
    }
}