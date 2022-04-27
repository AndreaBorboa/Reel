package borboa.andrea.reel_proyectomoviles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ComentariosAdapter(val comentariosList: List<comentario>) :

    RecyclerView.Adapter<ComentariosAdapter.ComentariosViewHolder>() {
    inner class ComentariosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val usuarioView : TextView
        val fechaView : TextView
        val comentarioView : TextView

        init {
            usuarioView = itemView.findViewById(R.id.nombreusuario)
            fechaView = itemView.findViewById(R.id.fecha)
            comentarioView = itemView.findViewById(R.id.comentariousuario)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComentariosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comentario, parent, false)
        return ComentariosViewHolder(view)
    }

    override fun onBindViewHolder(holder: ComentariosViewHolder, position: Int) {
        holder.usuarioView.setText(comentariosList[position].nombreUsuario)
        holder.fechaView.setText(comentariosList[position].fecha)
        holder.comentarioView.setText(comentariosList[position].comentario)
    }

    override fun getItemCount(): Int {
        return comentariosList.size
    }
}