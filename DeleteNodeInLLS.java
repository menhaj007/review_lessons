// public class DeleteNodeInLLS {

//   Node<T> head;

//   public void delete(T targetValue) {
//     /*
//     1. head is null, no node exist
//     2. if the target is the null value
//     3. if the target is in the middle of the list
//     4. if the target is the last item
//     */
//     if (head == null) {
//       System.out.println("Empty List.");
//       return;
//     }
//     else if (head.data.equals(targetValue)) {
//       head = head.next;
//     }
//     else if (head != null && head.data != targetValue) {
//       Node<T> tmp = head;
//       while (tmp.next != null) {

//         tmp = tmp.next;
//       }
//     }
//   }
// }
