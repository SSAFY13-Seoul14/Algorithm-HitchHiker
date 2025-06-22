use std::io::{self, Read, Write};

fn main() {
    let mut buf = String::new();
    io::stdin().read_to_string(&mut buf).unwrap();

    let mut input = buf.split_whitespace();

    let n: u32 = input.next().unwrap().parse().unwrap();

    let mut writer = io::BufWriter::new(io::stdout());
    writeln!(writer, "{}", (1u64 << n) - 1).unwrap();

    hanoi(&mut writer, n, 1, 2, 3);
}

fn hanoi(writer: &mut impl Write, n: u32, start: i32, stopover: i32, end: i32) {
    if n == 1 {
        writeln!(writer, "{start} {end}").unwrap();
        return;
    }

    hanoi(writer, n - 1, start, end, stopover);
    hanoi(writer, 1, start, stopover, end);
    hanoi(writer, n - 1, stopover, start, end);
}
