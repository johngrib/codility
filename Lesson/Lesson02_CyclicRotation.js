/*
 * https://codility.com/programmers/task/cyclic_rotation/
 */
function solution(A, K) {
    
    const rotate = A.length - (K % A.length);
    
    const head = A.slice(0, rotate);
    const tail = A.slice(rotate);
    
    return tail.concat(head);
}