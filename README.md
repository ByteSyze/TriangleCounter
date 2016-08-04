# TriangleCounter
A program to determine all combinations of triangles in a grid.
_______________________

The default configuration of this program is a 4x4 grid with no corners. Running Main.java will print the number of unique triangles and display a GUI with the results.

The resulting number of triangles can be calculated algorithmically as all unique combinations of 3 points in the grid minus all unique collinear combinations of 3 points:

                n!
       T = ------------  -  C, 
            (3!)(n-3)!         
                    
      
 where T is total triangles, n is the total number of points in the grid, and C is the total number of collinear combinations. C must be calculated on a per-grid basis, due to the complicated nature of invalidated points.
