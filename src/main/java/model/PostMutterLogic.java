package model;
//コード10-13　つぶやきの投稿に関する処理を行うモデル
import java.util.List;
public class PostMutterLogic {
	public void execute(Mutter mutter, List<Mutter> mutterList) {
		mutterList.add(0, mutter);	//先頭に追加
	}
}
