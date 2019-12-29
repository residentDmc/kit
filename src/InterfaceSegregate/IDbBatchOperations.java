package InterfaceSegregate;

public interface IDbBatchOperations extends IDatabaseManager {
    void RemoveBatch(int[] ids);
}