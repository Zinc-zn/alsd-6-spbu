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
    
    public boolean tambahKendaraan(Kendaraan k) {
        if (size >= capacity) {
            System.out.println("Antrian penuh! Tidak dapat menambah kendaraan.");
            return false;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = k;
        size++;
        System.out.println("Kendaraan masuk ke dalam antrian.");
        return true;
    }

    public Kendaraan kurangKendaraan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        } else {
            Kendaraan keluar = queue[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
            return keluar;
        }
    }
    
    public void tampilkanAntrian() {
        if (size == 0) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("Antrian Kendaraan:");
        
        int index = front;
        for (int i = 0; i < size; i++) {
            queue[index].tampil();
            index = (index + 1) % capacity;
        }
    }
    
    public boolean isEmpty() {
        return size == 0;
    }

    public void tampilJumlahAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
        } else {
            int jumlah = rear - front + 1;
            System.out.println(">> Jumlah Kendaraan di Antrian: " + jumlah);
        }
    }
}