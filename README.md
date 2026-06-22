# Procedural Fractal Engine: Sierpinski Triangle (Java to Python Migration)

A deterministic mathematical graphics engine designed to render geometric fractals pixel-by-pixel. This project highlights a migration path from a legacy **Java AWT Canvas** application to a modern, high-performance **Python/OpenCV** execution environment, retaining the absolute originality of the initial loop structures and math logic.

## 📐 Mathematical Concept
The engine generates variations of the **Sierpinski Triangle**, a mathematically fixed fractal fixed point with a base shape of an equilateral triangle subdivided recursively into smaller triangular sections. Instead of using recursive function calling geometry, this engine uncovers the fractal iteratively across a $1200 \times 1000$ viewport by utilizing modulo frequency spacing and strict linear inequality boundaries.

## 🚀 Live Interactive Demo

Run, inspect, and test the multi-pass loop rendering engine directly in your browser:
👉 **[Open in Google Colab](https://colab.research.google.com/drive/12Z72b3bBQXfIZfJw4XLaAYSj1x2Q9gBl#scrollTo=ZJoECg1qlNdr)**

---

## 🛠️ Code Architecture & Multi-Pass Logic

To preserve the absolute layout **originality of your explicit, nested loops**, the Python code replicates the 5 distinct mathematical processing passes sequentially. 

### 1. The Multi-Pass Rendering Pipeline
* **Pass 1 (Base Layer):** Sets the absolute triangular boundary limits using the geometric slopes `j >= 1.75 * (i - 768)` and `j >= -1.75 * (i - 768)`. It fills the interior canvas space with a baseline matrix pattern using micro-modulo intervals (`i % 24`, `j % 42
