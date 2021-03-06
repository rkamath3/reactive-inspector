package de.tuda.stg.reclipse.graphview.model;

import de.tuda.stg.reclipse.logger.BreakpointInformation;
import de.tuda.stg.reclipse.logger.ReactiveVariable;
import de.tuda.stg.reclipse.logger.RemoteLoggerInterface;

import java.rmi.RemoteException;
import java.util.UUID;

/**
 * Internal version of {@link RemoteLoggerInterface} without
 * {@link RemoteException} and {@link BreakpointInformation}.
 *
 */
public interface ILoggerInterface {

  public void logNodeCreated(final ReactiveVariable r);

  public void logNodeAttached(final ReactiveVariable r, final UUID dependentId);

  public void logNodeEvaluationEnded(final ReactiveVariable r);

  public void logNodeEvaluationEndedWithException(final ReactiveVariable r, final Exception e);

  public void logNodeEvaluationStarted(final ReactiveVariable r);

  public void logNodeValueSet(final ReactiveVariable r);

}
